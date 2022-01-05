package com.company.loops;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.print("Nota: ");
        n1 = sc.nextInt();

        while (n1 < 0 || n1 > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            n1 = sc.nextInt();
        }


        do {
            System.out.print("Informe um numero de 0 a 10: ");
            n1 = sc.nextInt();
             if (n1 < 0 || n1 > 10)
                 System.out.println("Numero inválido! Tente novamente\n");

        } while (n1 < 0 || n1 > 10);
        System.out.println("Número válido");
    }
}

