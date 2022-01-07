package com.company.arrays;

import java.util.Random;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] num = new int[20];
        int count = 0;

        do {
            int valor = random.nextInt(100);
            num[count] = valor;
            System.out.printf("%s%3d%s%7d\n", "Valor: ", num[count], "      Sucessor: ", (num[count] + 1));
            count++;
        } while(count < num.length);

    }
}
