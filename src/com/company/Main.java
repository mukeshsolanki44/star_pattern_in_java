package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                if (j < 5 - i)
                    System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");

            }
            System.out.println();
        }



//        Scanner sc=new Scanner(System.in);
//        int a= sc.nextInt();
//        System.out.println(b);


//        int b;
//        for ( b = 1 ; b <= (b + 1); b++) {
//            if (b % 2 == 0) {
//                System.out.println( b + " true");
//
//            } else {
//                System.out.println( b + " false");
//            }
//        }









    }
}
