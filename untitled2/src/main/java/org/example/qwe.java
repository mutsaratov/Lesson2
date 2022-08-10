package org.example;

import java.util.Scanner;

public class qwe {
    public static void Qwe() {


        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        String s1 = s;

        if (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (s.length() > 1023) {
                    System.out.println(s.substring(0, 1023));
                } else {
                    s += s1;
                }
            }
        } else if (s.length() % Math.abs(n) != 0) {
            System.out.println("NO SOLUTION");
        } else {
            int k = s.length() / Math.abs(n);
            int k1 = k + k;
            while (s.length() > k) {
                if (s.substring(0, k1).equals(s.substring(k, k1))) {
                    k += k;
                } else {
                    System.out.println("NO SOLUTION");
                }
            }
            System.out.println(s.substring(0, k1));
        }
        System.out.println(s);
    }
}
