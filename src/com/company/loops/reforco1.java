package com.company.loops;

public class reforco1 {
    public static void main(String[] args) {

        System.out.print("O número é: ");

        for(int i = 3; i <=11; i+=2){
            if(i == 7){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        int count = 0;
        while(count < 5){
            System.out.println("Texto Repetido");
            count++;
        }
    }
}
