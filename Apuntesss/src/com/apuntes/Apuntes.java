package com.apuntes;

public class Apuntes {

/*	-- Eliminar tablas si existen
 
	DROP TABLE IF EXISTS historial_movimientos;
	DROP TABLE IF EXISTS productos;
	DROP TABLE IF EXISTS categorias;

	-- Crear tabla categorias
	
	CREATE TABLE categorias (
	    id_categoria CHAR(4) PRIMARY KEY,
	    nombre_categoria VARCHAR(100) NOT NULL
	);

	-- Crear tabla productos
	
	CREATE TABLE productos (
	    id_producto CHAR(5) PRIMARY KEY,
	    nombre_producto VARCHAR(100) NOT NULL,
	    precio MONEY NOT NULL,
	    id_categoria CHAR(4) NOT NULL,
	    FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria)
	);

	-- Crear tabla historial_movimientos
	
	CREATE TABLE historial_movimientos (
	    id_movimiento SERIAL PRIMARY KEY,
	    fecha_movimiento TIMESTAMP NOT NULL,
	    id_producto CHAR(5) NOT NULL,
	    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
	);

	-- Verificar contenido de las tablas
	SELECT * FROM categorias;
	SELECT * FROM productos;
	SELECT * FROM historial_movimientos; 
	*/
	
	
	/*Ejrcicio 2.
	  
	 -- Insertar datos en categorias
INSERT INTO categorias (id_categoria, nombre_categoria) VALUES
('CAT1', 'Electrónica'),
('CAT2', 'Ropa');

-- Insertar datos en productos
INSERT INTO productos (id_producto, nombre_producto, precio, id_categoria) VALUES
('PROD1', 'Televisor', 500.00, 'CAT1'),
('PROD2', 'Camiseta', 20.00, 'CAT2');

-- Insertar datos en historial_movimientos
INSERT INTO historial_movimientos (fecha_movimiento, id_producto) VALUES
('2023/10/01 10:00', 'PROD1'),
('2023/10/02 15:30', 'PROD2');

-- Verificar contenido de las tablas
SELECT * FROM categorias;
SELECT * FROM productos;
SELECT * FROM historial_movimientos;
	 
	
	*/
	
	/*
	 * Ejercicio JAVA ENTIDADES es facil solo getter setter,contructores y toStrin leer el archivo prueba
	 * 
	 */
	
	/*
	 * Ejercicio JAVA 2 EXCEPCIONES
	 * 
	 * public class KrakeException extends Exception{ // nombre de la clase
	public KrakeException(String mensaje) {       //contructo a heredar
		super(mensaje);
	}

}
	 */
	
	/*
	 * EJEMPLO DE CONFIGURAR CONEXIO BDD 
	 *  private static final Logger logger = Logger.getLogger(ConexionBDD.class);  //EJM LOOGER
	 *  public static Connection obtenerConexion() throws KrakeDevException {
        Connection con = null;
        try {
            // Cargar el driver de PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Establecer conexión
            String url = "jdbc:postgresql://localhost:5432/tu_base_de_datos";
            String usuario = "tu_usuario";
            String contraseña = "tu_contraseña";

            con = DriverManager.getConnection(url, usuario, contraseña);
            logger.debug("Obteniendo conexión a la base de datos");     ///MENSAJE DEBUG DE LOG4

            return con;
        } catch (ClassNotFoundException e) {
            throw new KrakeDevException("Error al cargar el driver de PostgreSQL");
        } catch (SQLException e) {
            throw new KrakeDevException("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
	 */
	
	/*
	 * EJM MAIN PARA PROBAR COXENIO BDD
	 * try {
            ConexionBDD.obtenerConexion();
            System.out.println("Conexión exitosa");
        } catch (KrakeDevException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
	 */
	
	/*EJEMP INSERTAR CATEGORIA
	 * 
	 * public static void insertar(Categoria categoria) throws KrakeDevException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = ConexionBDD.obtenerConexion();
            ps = con.prepareStatement("INSERT INTO categorias (id_categoria, nombre_categoria) VALUES (?, ?)");
            ps.setString(1, categoria.getIdCategoria());
            ps.setString(2, categoria.getNombreCategoria());

            ps.executeUpdate();
        } catch (KrakeDevException e) {
            throw e; // Re-lanza la excepción con mensaje de usuario
        } catch (SQLException e) {
            throw new KrakeDevException("Error al insertar categoría: " + e.getMessage());
        } finally {
        if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
	 */
	
	/*Test categoria EJMP
	 * 
	 *  Categoria categoria = new Categoria("CAT3", "Deportes");
        try {
            ServiciosCategoria.insertar(categoria);
            System.out.println("Categoría insertada correctamente");
        } catch (KrakeDevException e) {
            System.err.println("Error al insertar categoría: " + e.getMessage());
        }
	 */
	
	/*
	 * EHEMPLO ACTUALIZAR 
	 * public static void actualizar(Categoria categoria) throws KrakeDevException {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = ConexionBDD.obtenerConexion();
            ps = con.prepareStatement("UPDATE categorias SET nombre_categoria = ? WHERE id_categoria = ?");
            ps.setString(1, categoria.getNombreCategoria());
            ps.setString(2, categoria.getIdCategoria());
            
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas == 0) {
                throw new KrakeDevException("No se encontró la categoría para actualizar");
            }
            
        } catch (KrakeDevException e) {
            throw e; // Re-lanza la excepción con mensaje de usuario
        } catch (SQLException e) {
            throw new KrakeDevException("Error al actualizar categoría: " + e.getMessage());
        } finally {
        if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
	 */
	
	/*EJEMP MAIN ACTUALIZAR 
	 * Categoria categoria = new Categoria("CAT1", "Electrónica Actualizada");
        
        try {
            ServiciosCategoria.actualizar(categoria);
            System.out.println("Categoría actualizada correctamente");
        } catch (KrakeDevException e) {
            System.err.println("Error al actualizar categoría: " + e.getMessage());
        }
	 */
	
	/*
	 * EJEMPLOO BUSCAR PROL




    

    public static Categoria buscarPorId(String idCategoria) throws KrakeDevException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Categoria categoria = null;
        
        try {
            con = ConexionBDD.obtenerConexion();
            ps = con.prepareStatement("SELECT id_categoria, nombre_categoria FROM categorias WHERE id_categoria = ?");
            ps.setString(1, idCategoria);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                String id = rs.getString("id_categoria");
                String nombre = rs.getString("nombre_categoria");
                categoria = new Categoria(id, nombre);
            }
            
        } catch (KrakeDevException e) {
            throw e; // Re-lanza la excepción con mensaje de usuario
        } catch (SQLException e) {
            throw new KrakeDevException("Error al buscar categoría: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
          
        
        
        return categoria;
    }

	 */
	
	/*
	 * EJEMPLO MAIN BUSCAR PROI
	 *  String idBuscar = "CAT1"; // Cambiar por un ID que exista en su base de datos
        
        try {
            Categoria categoria = ServiciosCategoria.buscarPorId(idBuscar);
            
            if (categoria != null) {
                System.out.println("Categoría encontrada:");
                System.out.println(categoria);
            } else {
                System.out.println("No existe la categoría buscada");
            }
        } catch (KrakeDevException e) {
            System.err.println("Error al buscar categoría: " + e.getMessage());
        }
	 */
	
	
	
	/*
	 * EJEMPLO RECUPERAR TODDO
	 * 
	 * public static ArrayList<Categoria> recuperarTodos() throws KrakeDevException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Categoria> categorias = new ArrayList<>();
        
        try {
            con = ConexionBDD.obtenerConexion();
            ps = con.prepareStatement("SELECT id_categoria, nombre_categoria FROM categorias");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                String id = rs.getString("id_categoria");
                String nombre = rs.getString("nombre_categoria");
                categorias.add(new Categoria(id, nombre));
            }
            
        } catch (KrakeDevException e) {
            throw e; // Re-lanza la excepción con mensaje de usuario
        } catch (SQLException e) {
            throw new KrakeDevException("Error al recuperar categorías: " + e.getMessage());
        } finally {
         if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
	 */
	
	
	/*
	 * EJEPLO MAIN BUSCAR TODOSS
	 * try {
            ArrayList<Categoria> categorias = ServiciosCategoria.recuperarTodos();
            
            if (categorias.isEmpty()) {
                System.out.println("No hay categorías registradas");
            } else {
                System.out.println("Lista de categorías:");
                for (Categoria categoria : categorias) {
                    System.out.println(categoria);
                }
            }
        } catch (KrakeDevException e) {
            System.err.println("Error al recuperar categorías: " + e.getMessage());
        }
	 */
}
