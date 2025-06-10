package com.fieb.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RecursosUteis {

    public static LocalDate transformStringToLocalDate(String dataString, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        LocalDate data = null;
        try {
            data = LocalDate.parse(dataString, formatter);
            return data;
        } catch (Exception e) {
            throw new RuntimeException("Formato inválido. Tente novamente com dd/MM/yyyy");
        }
    }
}
