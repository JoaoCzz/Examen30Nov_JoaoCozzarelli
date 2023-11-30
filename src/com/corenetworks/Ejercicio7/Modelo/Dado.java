package com.corenetworks.Ejercicio7.Modelo;

import java.util.Random;

public class Dado {
    private Random aleatorio= new Random();

    public String LanzarDado() {
        switch (aleatorio.nextInt(1, 6)) {
            case 1:
                return dibujarUno();
            case 2:
                return dibujarDos();
            case 3:
                return dibujarTres();
            case 4:
                return dibujarCuatro();
            case 5:
                return dibujarSeis();
            case 6:
                return dibujarSeis();

        }
return LanzarDado();
    }
    public String dibujarUno(){
        return
                "      \n" +
                "  x   \n" +
                "     ";
    }
    public String dibujarDos(){
        return   "      \n" +
                 "x   x \n" +
                 "     ";
    }
    public String dibujarTres(){
        return  "      \n" +
                "x x x \n" +
                "     ";
    }
    public String dibujarCuatro(){
        return  "x   x \n" +
                "      \n" +
                "x   x";
    }
    public String dibujarCinco(){
        return  "x   x \n" +
                "  x   \n" +
                "x   x";
    }
    public String dibujarSeis(){
        return  "x x x \n" +
                "      \n" +
                "x x x";
    }

    public Dado() {

    }

    public Dado(Random aleatorio) {
        this.aleatorio = aleatorio;
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }
}

