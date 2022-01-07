package com.company.arrays;

import java.util.Arrays;

public class exercicios1 {

    public static void main(String[] args) {

        int[] numeros = {76, 21, -9, 45, 8, 18};
        int i = numeros.length - 1;

        System.out.println("Vetor1: ");
        while(i >= 0){
            System.out.print(numeros[i]+ " ");
            i--;
        }
        System.out.println("\nVetor2: ");
        for(int count = 0; count <= (numeros.length -1); count++){
            System.out.print(numeros[count] + " ");
        }
    }

}
