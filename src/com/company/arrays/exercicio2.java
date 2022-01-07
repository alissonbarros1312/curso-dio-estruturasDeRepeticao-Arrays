package com.company.arrays;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vetor = new String[6];
        int consoantes = 0;

             for(int c = 0; c < vetor.length; c++){
                System.out.print("Digite um caractere: ");
                vetor[c] = sc.nextLine();
             }

        // Laço for each -- a String s irá passar pelas posiçoes do vetor
        for (String s : vetor) {

            switch (s) {
                case "A":
                    continue;
                case "E":
                    continue;
                case "I":
                    continue;
                case "O":
                    continue;
                case "U":
                    continue;
            }
            consoantes++;
            System.out.println("Consoante: " + s);
        }
        System.out.println("Foram lidas " + consoantes + " consoantes");
        }
    }
