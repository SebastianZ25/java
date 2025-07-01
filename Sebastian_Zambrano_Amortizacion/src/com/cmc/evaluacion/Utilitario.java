package com.cmc.evaluacion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utilitario {

    
    public static double redondear(double valor) {
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}