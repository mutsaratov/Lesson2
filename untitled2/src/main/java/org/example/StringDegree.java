package org.example;

import java.util.Scanner;

public class StringDegree {

    public static void getDegree(){
        Scanner in = new Scanner(System.in);

        System.out.println("Vvedite stroky.");
        String string = in.next().toLowerCase();

        while (string.length() >= 1000 || string.length() == 0){
            System.out.println("Stroka ne sootvetstvuet trebovaniam. Vvedite drygyu stroky.");
            string = in.next().toLowerCase();
        }

        System.out.println("Vvedite stepen'.");
        int degree = in.nextInt();

        while (degree % 1 != 0 || degree == 0 || Math.abs(degree) >= 100001){
            System.out.println("Stepen' ne sootvetstvuet trebovaniam. Vvedite drygyu stepen'.");
            degree = in.nextInt();
        }

        int root;
        int length;
        int c = 0;
        String newString;
        if (degree > 0) {
            newString = string.toLowerCase().repeat(degree);
            if (newString.length()>1023){
                System.out.println(newString.substring(0,1023));
            } else {
                System.out.println(newString);
            }
        } else if (degree < 0) {
            root = Math.abs(degree);
            length = string.length()/root;
            if (string.length() % root == 0){
                for (int i = 0; i < root-1; i++) {
                    if (!string.substring(i*length, (i+1)*length).equals(string.substring((i+1)*length, (i+2)*length))){
                        c++;
                    } else {
                        System.out.println(string.substring(0,length));
                    }
                }
                if (c > 0){
                    System.out.println("NO SOLUTION");
                }
            } else {
                System.out.println("NO SOLUTION");
            }
        } else {
            System.out.println("NO SOLUTION");
        }
    }
}
