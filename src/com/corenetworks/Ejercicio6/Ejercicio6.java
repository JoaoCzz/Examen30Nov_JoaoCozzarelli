package com.corenetworks.Ejercicio6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Calcular la edad en años de una persona que nacio el 30 de agosto de 1992.
        LocalDate edad=LocalDate.of(1992, Month.AUGUST,30);
        Period periodo= Period.between(edad,LocalDate.now());
        System.out.println(periodo.getYears() + "Años");
        //Mostrar la fecha de hoy
        System.out.println("Hoy es: "+LocalDate.now());
        //Añadir dos meses a la fecha de inicio del curso 9 de octubre del 2023
        LocalDate inicio= LocalDate.of(2023,Month.OCTOBER,9);
        System.out.println(inicio.plusMonths(2));
    }
}
