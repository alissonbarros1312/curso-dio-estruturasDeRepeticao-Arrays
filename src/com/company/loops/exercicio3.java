package com.company.loops;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int varMaior = 0;
        int cont = 0;
        double  media = 0;

        do{
            System.out.print("Digite um numero: ");
            n1 = sc.nextInt();

            // valor maior
            if (n1 > varMaior) varMaior = n1;

            //adicinando a media media
            media += n1;
            cont++;

        } while(cont < 5);

        System.out.println("O maior numero foi: " + varMaior);
        System.out.println("A média é: " + (media / 5));
    }

}
