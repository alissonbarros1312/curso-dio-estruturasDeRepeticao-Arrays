package com.company.loops;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int cont1 = 0;
        int cont2 = 0;
        int par = 0;
        int impar = 0;

        System.out.print("Quantos numeros serão digitados: ");
        cont1 = sc.nextInt();

        do {
            System.out.print("Digite um  numero: ");
            num = sc.nextInt();

            if (num % 2 == 0) par++;
            else impar++;

            cont2++;
        } while(cont1 > cont2);

        System.out.println("\nNumero de pares: " + par);
        System.out.println("Numero de impares: " + impar);
    }
}
