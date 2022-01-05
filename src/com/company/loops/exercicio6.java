package com.company.loops;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fat;
        int soma = 1;

        System.out.print("Digite o  número: ");
        fat = sc.nextInt();

        for(int i = fat; i >= 1; i--) soma *= i;

        System.out.println("\n"+fat + "! = " + soma);
    }
}
