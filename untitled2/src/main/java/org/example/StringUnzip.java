package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class StringUnzip {
    public static void Unzip(String string){
        String resString = "";
        int count = 0;

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.substring(i, i + 1));
        }

        for (int i = 0; i < string.length(); i++) {
            if (list.get(i).matches("\\d")){
                count = count * 10 + Integer.parseInt(list.get(i));
            } else {
                if (count == 0){
                    resString += list.get(i);
                } else {
                    resString += list.get(i).repeat(count);
                    count = 0;
                }
            }
        }

        while (resString.length() >= 40){
            System.out.println(resString.substring(0,40));
            resString = resString.substring(40, resString.length());
        }
        System.out.println(resString);
    }
}
