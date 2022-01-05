package com.company.loops;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = " ";
        int idade;

        while(nome != "0"){

            //entrada de dados
            System.out.println("\nInsira os dados, para cancelar digite 0");
            System.out.print("Digite o nome: ");
            nome = sc.next();
           //condicao de termino
            if (nome.equals("0")) break;

            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
        }

    }
}
