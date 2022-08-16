package org.example;

import java.util.Arrays;

public class PalindromeCheck {
    public static void check(String string){
        char[] arr1 = new char[string.length()];
        char[] arr2 = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            arr1[i] = string.charAt(i);
            arr2[i] = string.charAt(string.length()-1-i);
        }

        if (Arrays.equals(arr1,arr2)){
            System.out.println("Yeah. This is palindrome");
        } else {
            System.out.println("Nope. This isn't palindrome");
        }
    }
}
