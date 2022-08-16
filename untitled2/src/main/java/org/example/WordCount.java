package org.example;

import java.util.ArrayList;

public class WordCount {
    public static void Count(String text) {
        String text2 = text.replace("\n", " ");
        String resString = text2.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "").toLowerCase();
        String[] qwe = resString.split(" ");

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>(qwe.length);
        int k = 1;
        for (int i = 0; i < qwe.length; i++) {
            if (!list.contains(qwe[i])){
                list.add(qwe[i]);
                count.add(1);
                k=1;
            } else {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).equals(qwe[i])){
                        count.set(j, count.get(j) + 1);
                    }
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " - " + count.get(i));
        }
    }
}
