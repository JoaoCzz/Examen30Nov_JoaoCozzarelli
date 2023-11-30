package com.corenetworks.Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        String frase= "Nunca mates a una mosca sobre la cabeza de un tigre.";
//Mostrar la cadena toda en mayuscula
        System.out.println(frase.toUpperCase());
        //Mostra la cadena en minuscula
        System.out.println(frase.toLowerCase());
        // Mostras solo la palabra sobre
        System.out.println(frase.substring(frase.indexOf("sobre"),frase.indexOf("sobre")+"sobre".length()));
        //Mostrar la posicion de la letra m.
        System.out.println(frase.indexOf("m"));
        //Devolver la longitud de la cadena
        System.out.println(frase.length());
    }
}
