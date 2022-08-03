package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BullsAndCows {
    static Scanner in = new Scanner(System.in);
    static int q = 0;
    static int lowerBorder;
    static int upperBorder;
    static int size;
    static int bullsCount = 0;
    static int cowsCount = 0;
    static ArrayList<Integer> puzzle = new ArrayList<Integer>();
    static ArrayList<Integer> variant = new ArrayList<Integer>(size);

    public static void StartGame() {

        CreateRules();
        System.out.println("Ok. Ya zagadal chisla. Poprobyi ygadat'");
        GuessNumbers(size,lowerBorder,upperBorder);
        do {
            System.out.println("Vvedi svoi variant");
            ReadNums(size);
            System.out.println("Tvoya posledovatel'nost' - " + variant);
            CheckVariant();
        } while (bullsCount != size);
    }


    public static ArrayList GuessNumbers(int size, int lowerBorder, int upperBorder){
        Random random = new Random();

        int a = 0;
        for (int i = 0; i < size; i++) {
            do {
               a = random.nextInt(lowerBorder,upperBorder);
            } while (puzzle.contains(a));
            puzzle.add(a);
        }
        return puzzle;
    }

    public static void CreateRules(){
        System.out.println("Vvedi min chislo");
        lowerBorder = in.nextInt();
        System.out.println("Vvedi max chislo");
        upperBorder = in.nextInt();
        System.out.println("Skolko chisel zagadat'?");
        size = in.nextInt();
    }

    public static void ReadNums(int size){

        variant.clear();
        for (int i = 0; i < size; i++) {
            System.out.println("Vvedi predpolagaemoe chislo #" + (i+1));
            variant.add(in.nextInt());
            q++;
        }
    }

    public static void CheckVariant(){
        bullsCount = 0;
        cowsCount = 0;
        for (int i = 0; i < size; i++) {
                if (puzzle.get(i) == variant.get(i)){
                    bullsCount ++;
                } else if (puzzle.contains(variant.get(i))) {
                    cowsCount ++;
                }
            }
        System.out.println("Bikov - " + bullsCount + ", korov - " + cowsCount);
        if (bullsCount == size){
            System.out.println("Moi pozdravleniya. Ti nashel vseh bikov!!!");
        } else {
            System.out.println("Blizko. Try again!");
        }
    }
}
