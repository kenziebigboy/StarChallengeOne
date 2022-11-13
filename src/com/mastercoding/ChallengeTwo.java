package com.mastercoding;

import java.awt.*;
import java.util.Scanner;

public class ChallengeTwo {

    // https://youtu.be/mbyvGW6hEog video Two A
    // https://youtu.be/mbyvGW6hEog video Two B


    public static final String ANSI_RESET   = "\u001B[0m";
    public static final String ANSI_BLACK   = "\u001B[30m"; // 1
    public static final String ANSI_RED     = "\u001B[31m"; // 2
    public static final String ANSI_GREEN   = "\u001B[32m"; // 3
    public static final String ANSI_YELLOW  = "\u001B[33m"; // 4
    public static final String ANSI_BLUE    = "\u001B[34m"; // 5
    public static final String ANSI_PURPLE  = "\u001B[35m"; // 6
    public static final String ANSI_CYAN    = "\u001B[36m"; // 7
    public static final String ANSI_WHITE   = "\u001B[37m"; // 8

    public static void PatternOne(){

        int maxrows     = 2;
        int maxColoumns = 2;

        for(int rows = 0; rows < maxrows; rows++){
            for(int column = 0; column < maxColoumns; column++){
                // put your logic here
                // remember to use print and not println
                if (rows == 0){
                    System.out.print("*");
                }
                if (rows == 1 && column == 1){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    public static void PatternTwo(){
        int maxrows     = 3;
        int maxColoumns = 3;

        for(int rows = 0; rows < maxrows; rows++){
            for(int column = 0; column < maxColoumns; column++){
                // put your logic here
                // remember to use print and not println
                if((rows == 0 || rows == 2) && column == 1){
                    System.out.print("*");
                }
                if((rows == 0 || rows == 2 ) && (column == 0 || column == 2)){
                    System.out.print(" ");
                }

                if(rows == 1 && (column == 0 || column == 2)){
                    System.out.print("*");
                }
                if(rows == 1 && column == 1){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void PatternThree(){
        int maxrows     = 5;
        int maxColoumns = 5;

        for(int rows = 0; rows < maxrows; rows++){
            for(int column = 0; column < maxColoumns; column++){
                // put your logic here
                // remember to use print and not println
                if (rows == 0 || rows == 4){
                    System.out.print("*");
                }
                if ((rows == 1 || rows == 3) && (column == 0 || column == 4)){
                    System.out.print("*");
                }
                if((rows == 1 || rows == 3) && (column >= 1 && column <= 3)){
                    System.out.print(" ");
                }
                if (rows == 2 && (column == 0 || column == 2 || column == 4)){
                    System.out.print("*");
                }
                if(rows == 2 && (column == 1 || column == 3)){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void PatternFour(){
        int maxrows     = 11;
        int maxColoumns = 10;

        boolean print = false;

        for(int rows = 0; rows < maxrows; rows++){
            for(int column = 0; column < maxColoumns; column++){
                // put your logic here
                // remember to use print and not println

                if (rows == 0 || rows == 4){
                    if(column >= 1 && column <= 3){
                        print = true;
                    }
                }

                if (rows == 1 || rows == 3){
                    if (column == 0 || column == 4){
                        print = true;
                    }
                }

                if (rows == 2){
                    if (column == 0 || column == 2 || column == 4){
                        print = true;
                    }
                }

                if (rows == 5){
                    if (column == 2){
                        print = true;
                    }
                }

                if (rows == 6){
                    if (column == 2 || (column >= 6 && column <= 8)){
                        print = true;
                    }
                }

                if (rows == 7){
                    if(column == 2 || column == 5 || column == 9){
                        print = true;
                    }
                }

                if (rows == 8){
                    if ((column >= 2 && column <= 5) || column == 7 || column == 9 ){
                        print = true;
                    }
                }

                if (rows == 9){
                    if (column == 5 || column == 9){
                        print = true;
                    }
                }

                if (rows == 10){
                    if (column >= 6 && column <= 8){
                        print = true;
                    }
                }

                if (print){
                    System.out.print("*");
                    print = false;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void PatternOneColor(){

        int maxrows     = 2;
        int maxColoumns = 2;

        boolean print       = false;
        boolean printRed    = false;

        for(int rows = 0; rows < maxrows; rows++){
            for(int column = 0; column < maxColoumns; column++){
                // put your logic here
                // remember to use print and not println
                if (rows == 0 && column == 0){
                    printRed = true;
                }
                if (rows == 0 && column == 1){
                    print = true;
                }

                if (rows == 1 && column == 0){
                    print = true;
                }

                if (print){
                    System.out.print("*");
                    print = false;
                } else if(printRed){
                    System.out.print(ANSI_RED + "*" + ANSI_RESET);
                    printRed = false;
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void PatterThreeColor(){
        int maxrows     = 5;
        int maxColoumns = 5;

        int color = -1;
        int [] row0 = new int[]{2,2,2,2,2};
        int [] row1 = new int[]{2,0,0,0,2};
        int [] row2 = new int[]{2,0,2,0,2};

        for(int rows = 0; rows < maxrows; rows++){
            for(int column = 0; column < maxColoumns; column++){
                // put your logic here
                // remember to use print and not println

                switch (rows){
                    case 0:
                    case 4:
                        color = row0[column];
                        break;
                    case 1:
                    case 3:
                        color = row1[column];
                        break;
                    case 2:
                        color = row2[column];
                }



                switch (color){
                    case 1:
                        System.out.print(ANSI_BLACK + "*" + ANSI_RESET);
                        break;
                    case 2:
                        System.out.print(ANSI_RED + "*" + ANSI_RESET);
                        break;
                    case 3:
                        System.out.print(ANSI_GREEN + "*" + ANSI_RESET);
                        break;
                    case 4:
                        System.out.print(ANSI_YELLOW + "*" + ANSI_RESET);
                        break;
                    case 5:
                        System.out.print(ANSI_BLUE + "*" + ANSI_RESET);
                        break;
                    case 6:
                        System.out.print(ANSI_PURPLE + "*" + ANSI_RESET);
                        break;
                    case 7:
                        System.out.print(ANSI_CYAN + "*" + ANSI_RESET);
                        break;
                    case 8:
                        System.out.print(ANSI_WHITE + "*" + ANSI_RESET);
                        break;
                    default:
                        System.out.print(" ");

                }
                color = 0;

            }
            System.out.println();
        }
    }

    public static void DisplayMenu(){
        System.out.println("Welcome to the pattern display.");
        System.out.println("0: Exit");
        System.out.println("1: Pattern 1");
        System.out.println("2: Pattern 2");
        System.out.println("3: Pattern 3");
        System.out.println("4: Pattern 4");

        System.out.println("20: Pattern 1 Color");

        System.out.println("22: Pattern 3 Color");


    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        boolean loopConllrot = true;
        DisplayMenu();
        int menuItem = -1;
        while (loopConllrot){
            menuItem = scanner.nextInt();

            for(int i = 0; i < 10; i++){
                System.out.println();
            }


            switch (menuItem){
                case 0:
                    loopConllrot = false;
                    break;
                case 1:
                    PatternOne();
                    break;
                case 2:
                    PatternTwo();
                    break;
                case 3:
                    PatternThree();
                    break;
                case 4:
                    PatternFour();
                    break;
                case 20:
                    PatternOneColor();
                    break;
                case 22:
                    PatterThreeColor();
                    break;

                default:
                    DisplayMenu();
            }
            System.out.println("Enter next menu item:");
        }

    }
}
