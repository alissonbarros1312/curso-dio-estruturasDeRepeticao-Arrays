package com.company.loops;

public class reforco2 {
    public static void main(String[] args) {

        for(int i = 1; i <15; i++){
            if (i == 12) continue;

            if (i % 2 == 0){
                System.out.println("For: " + i);
            }
        }

        System.out.println();

        int count = 1;
        while(count < 15){
            if(count == 12){
                count++;
                continue;
            }

            if(count % 2 == 0){
                System.out.println("While: " + count);
            }
            count++;
        }
    }
}
