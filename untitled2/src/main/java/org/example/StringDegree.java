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
        double degree = in.nextDouble();

        while (degree % 1 != 0 || degree == 0 || Math.abs(degree) >= 100001){
            System.out.println("Stepen' ne sootvetstvuet trebovaniam. Vvedite drygyu stepen'.");
            degree = in.nextDouble();
        }

        int root;
        String rootOfString;
//        System.out.println(root);
//        if (root % 1 == 0 ) {
//            System.out.println(root);
//        } else {
//            System.out.println("Ne norm");
//        }
        String newString;
        if (degree > 0) {
            newString = string.toLowerCase().repeat((int)degree);
            System.out.println(newString);
        } else if (degree < 0) {
            root = (int) Math.round(Math.pow(string.length(), 1.0/(Math.abs((int)degree))));
            rootOfString = string.toLowerCase().substring(0, root);
            System.out.println(rootOfString);
        } else {
            System.out.println("Stepen' ravna 0");
        }
    }
}
