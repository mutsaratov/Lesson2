package org.example;

import java.util.Scanner;

public class StringDegree2 {

    public static void getDegree(){
        Scanner in = new Scanner(System.in);

        System.out.println("Vvedite stroky.");
        String string = in.next().toLowerCase();
        System.out.println("Vvedite stepen'.");
        double degree = in.nextDouble();

        if (string.length() >= 1000 || string.length() == 0){
            System.out.println("NO SOLUTION");
        }

        if (degree % 1 != 0 || degree == 0 || Math.abs(degree) >= 100001){
            System.out.println("NO SOLUTION");
        }

        int root;
        double mod = Math.abs(degree);
        String rootOfString;
        String newString;
        if (degree > 0) {
            newString = string.toLowerCase().repeat((int)degree);
            System.out.println(newString);
        } else  {
            root = (int) Math.round(Math.pow(string.length(), 1.0/(Math.abs(degree))));
            if (root == 1) {
                System.out.println("NO SOLUTION");

            } else {
                rootOfString = string.toLowerCase().substring(0, root);
                System.out.println(rootOfString);
            }
            }
        }
    }
