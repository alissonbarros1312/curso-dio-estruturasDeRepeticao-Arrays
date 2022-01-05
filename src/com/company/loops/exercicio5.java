package com.company.loops;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tab;
        int result;

        System.out.print("Digite a Tabuada que deseja ver: ");
        tab = sc.nextInt();
        System.out.println("Tabuada do " + tab);

        for(int i = 1; i < 11; i++){
            result = tab * i;
            System.out.println(tab + " X "+ i + " = " + result);
        }
    }
}
