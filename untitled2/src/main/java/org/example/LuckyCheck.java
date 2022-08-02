package org.example;

import java.util.ArrayList;

public class LuckyCheck {
    public static void check(int number) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        do {
            arr.add(number % 10);
            number /= 10;
        } while (number > 0);

        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < arr.size() / 2; i++) {
            secondHalf += arr.get(i);
        }
        for (int i = arr.size() / 2; i < arr.size(); i++) {
            firstHalf += arr.get(i);
        }

        if ((arr.size() % 2) != 0) {
            System.out.println("Error. V bilete ne chetnoe chislo elementov");
        } else {
            if (firstHalf == secondHalf) {
                System.out.println("Grac! Tvoi bilet krutoi");
            } else {
                System.out.println("Nu, ne povezlo");
            }
        }
    }
}

