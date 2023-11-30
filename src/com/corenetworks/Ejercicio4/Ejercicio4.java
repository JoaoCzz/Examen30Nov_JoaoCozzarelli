package com.corenetworks.Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros= {2,-4,-13,1,-3,15,1,9,6,-8,4,23,7,-13,13,23,15,-13,9,0};
int numeroMasgrande= numeros[0];
int numeroMaspequeño= numeros[0];
int Contador= 0;
        for (int i=1; i<numeros.length;i++){
            if (numeros[i]>numeroMasgrande){
                numeroMasgrande= numeros[i];
            }
            if (numeros[i]<numeroMaspequeño){
                numeroMaspequeño= numeros[i];
            }
        }
        System.out.println("El numero mas Alto es --->  "+ numeroMasgrande);
        System.out.println("El numero mas pequeño es ---> " + numeroMaspequeño);

    }
    }
