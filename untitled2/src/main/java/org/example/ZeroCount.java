package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ZeroCount {
    public static void count(String number) {

        int count = 0;
        int finalCount = 0;
        for (int i = 0; i < number.length(); i++) {
            char sym = number.charAt(i);
            if (sym == '0'){
                count += 1;
            } else if (count > finalCount) {
                finalCount = count;
                count = 0;
            } else {
                count = 0;
            }
        }
        System.out.println(finalCount);
    }
}
