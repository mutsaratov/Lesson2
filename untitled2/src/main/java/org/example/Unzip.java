package org.example;

import java.util.ArrayList;

public class Unzip {
    public static void Unzip(String string) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.substring(i, i + 1));
        }
        System.out.println(list);

        ArrayList<String> letterCount = new ArrayList<String>();
        ArrayList<String> letter = new ArrayList<String>();


        String bufferString;
        for (int i = 0; i < string.length();) {
            if (list.get(i).matches("\\d")) {
                bufferString = "";
                while (list.get(i).matches("\\d")) {
                    bufferString = bufferString + list.get(i);
                    i++;
                }
                letterCount.add(bufferString);
            } else {
                letter.add(list.get(i).toUpperCase());
                i++;
            }
        }

//        while (list.get(i).matches("\\d")) {
//            bufferString = bufferString + list.get(i);
//            i++;
//        }
//        System.out.println(bufferString);

        System.out.println(letter);
        System.out.println(letterCount);
    }

    public static String returnBufferString(){
        String bufferString = "";
        return bufferString;
    }
}
