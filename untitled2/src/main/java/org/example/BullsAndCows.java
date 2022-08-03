package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BullsAndCows {
    static Scanner in = new Scanner(System.in);
    static int q = 0;
    static int lowerBorder;
    static int upperBorder;
    static int size = 4;
    static int bullsCount = 0;
    static int cowsCount = 0;
    static ArrayList<Integer> puzzle = new ArrayList<Integer>();
    static ArrayList<Integer> variant = new ArrayList<Integer>(size);

    public static void Check() {

//        CreateRules();
//        GuessNumbers(size,lowerBorder,upperBorder);
        GuessNumbers(size,0,9);

        do {
            System.out.println("Vvedite svoi variant");
            if (q == 0) {
                ReadFirstNums(size);
            }else {ReadSecondNums(size);}
            System.out.println(puzzle);
            System.out.println(variant);
            CheckVariant();
            if (bullsCount == size){
                System.out.println("Moi pozdravleniya. Ti nashel vseh bikov!!!");
            } else {
                System.out.println("Blizko. Try again!");
            }
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
        System.out.println("Vvedite min chislo");
        lowerBorder = in.nextInt();
        System.out.println("Vvedite max chislo");
        upperBorder = in.nextInt();
        System.out.println("Skolko chisel zagadat'?");
        size = in.nextInt();
    }

    public static void ReadFirstNums(int size){

        for (int i = 0; i < size; i++) {
            System.out.println("Vvedite predpolagaemoe chislo #" + (i+1));
            variant.add(in.nextInt());
            q++;
        }
    }

    public static void ReadSecondNums(int size){

        for (int i = 0; i < size; i++) {
            System.out.println("Vvedite predpolagaemoe chislo #" + (i+1));
            variant.set(i, in.nextInt());
        }
    }

    public static void CheckVariant(){
        bullsCount = 0;
        cowsCount = 0;
        for (int i : variant) {
            if (puzzle.get(i) == variant.get(i)){
                bullsCount ++;
            } else if (puzzle.contains(variant.get(i))) {
                cowsCount ++;
            }
        }
        System.out.println("Bikov - " + bullsCount + ", korov - " + cowsCount);
    }
}
