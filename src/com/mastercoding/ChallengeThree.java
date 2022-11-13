package com.mastercoding;

import java.util.Random;
import java.util.Scanner;

public class ChallengeThree {

    // https://youtu.be/Vd-atin1KOU its long

    public static final String ANSI_RESET   = "\u001B[0m";
    public static final String ANSI_BLACK   = "\u001B[30m"; // 1
    public static final String ANSI_RED     = "\u001B[31m"; // 2
    public static final String ANSI_GREEN   = "\u001B[32m"; // 3
    public static final String ANSI_YELLOW  = "\u001B[33m"; // 4
    public static final String ANSI_BLUE    = "\u001B[34m"; // 5
    public static final String ANSI_PURPLE  = "\u001B[35m"; // 6
    public static final String ANSI_CYAN    = "\u001B[36m"; // 7
    public static final String ANSI_WHITE   = "\u001B[37m"; // 8

    public static final String [] charSet = new String[] {" ","\u2554","\u2566","\u2550","\u2557","\u2560",
            "\u256C","\u2563","\u2551","\u255D","\u2569","\u255A","\u2600","\u2602","\u2601","\u2603",
            "\u2680","\u2681","\u2682","\u2683","\u2684","\u2685","\u2665","\u2666","\u2663","\u2664"};


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

    public static void Patter100(){
        int maxrows     = 5;
        int maxColoumns = 5;

        int color = -1;
        String  printChar = "";
        
        int [] row0Color = new int[]{2,2,2,2,2};
        int [] row1Color = new int[]{3,0,2,0,2};
        int [] row2Color = new int[]{2,2,2,5,2};
        int [] row3Color = new int[]{2,0,2,0,2};
        int [] row4Color = new int[]{2,6,2,2,2};

        int [] row0Char = new int[]{1,3,2,3,4};
        int [] row1Char = new int[]{8,0,8,0,8};
        int [] row2Char = new int[]{5,3,6,3,7};
        int [] row3Char = new int[]{8,0,8,0,8};
        int [] row4Char = new int[]{11,3,10,3,9};

        for(int rows = 0; rows < maxrows; rows++){
            for(int column = 0; column < maxColoumns; column++){
                // put your logic here
                // remember to use print and not println

                switch (rows){
                    case 0:
                        color = row0Color[column];
                        printChar = charSet[row0Char[column]];
                        break;
                    case 1:
                        color = row1Color[column];
                        printChar = charSet[row1Char[column]];
                        break;
                    case 2:
                        color = row2Color[column];
                        printChar = charSet[row2Char[column]];
                        break;
                    case 3:
                        color = row3Color[column];
                        printChar = charSet[row3Char[column]];                        
                        break; 
                        
                    case 4:
                        color = row4Color[column];
                        printChar = charSet[row4Char[column]];
                        break;
                
                }



                switch (color){
                    case 1:
                        System.out.print(ANSI_BLACK + printChar + ANSI_RESET);
                        break;
                    case 2:
                        System.out.print(ANSI_RED + printChar + ANSI_RESET);
                        break;
                    case 3:
                        System.out.print(ANSI_GREEN + printChar + ANSI_RESET);
                        break;
                    case 4:
                        System.out.print(ANSI_YELLOW + printChar + ANSI_RESET);
                        break;
                    case 5:
                        System.out.print(ANSI_BLUE + printChar + ANSI_RESET);
                        break;
                    case 6:
                        System.out.print(ANSI_PURPLE + printChar + ANSI_RESET);
                        break;
                    case 7:
                        System.out.print(ANSI_CYAN + printChar + ANSI_RESET);
                        break;
                    case 8:
                        System.out.print(ANSI_WHITE + printChar + ANSI_RESET);
                        break;
                    default:
                        System.out.print(" ");

                }
                color = 0;
                printChar = "";

            }
            System.out.println();
        }
    }


    public static void Patter101(){
        int maxrows     = 15;
        int maxColoumns = 15;

        int color = -1;
        String  printChar = "";

        Random rand = new Random();
        int [] dices = new int[7];
        for (int i = 0; i < dices.length; i++) {
            dices[i] = rand.nextInt(6) + 16;
        }

        int [] row0Color = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int [] row1Color = new int[]{0,5,5,5,0,0,0,0,0,0,0,0,0,0,0};
        int [] row2Color = new int[]{0,5,5,5,5,5,0,5,5,5,0,0,0,0,0};
        int [] row3Color = new int[]{0,5,5,5,0,5,5,5,5,5,0,0,0,0,0};
        int [] row4Color = new int[]{0,0,0,0,0,5,0,5,5,5,0,5,5,5,0};
        int [] row5Color = new int[]{0,0,0,0,0,5,0,0,0,0,0,5,5,5,0};
        int [] row6Color = new int[]{0,0,0,0,0,5,0,0,0,0,0,5,5,5,0};
        int [] row7Color = new int[]{0,5,5,5,0,5,0,0,0,0,0,0,5,0,0};
        int [] row8Color = new int[]{0,5,5,5,5,5,0,0,5,5,5,5,5,0,0};
        int [] row9Color = new int[]{0,5,5,5,0,5,5,5,5,0,0,0,5,0,0};
        int [] row10Color = new int[]{0,0,0,0,0,5,0,0,0,0,0,0,5,0,0};
        int [] row11Color = new int[]{0,0,0,0,0,5,0,5,5,5,0,5,5,5,0};
        int [] row12Color = new int[]{5,5,5,0,0,5,5,5,5,5,0,5,5,5,0};
        int [] row13Color = new int[]{5,5,5,5,5,5,0,5,5,5,0,5,5,5,0};
        int [] row14Color = new int[]{5,5,5,0,0,0,0,0,0,0,0,0,0,0,0};

        int [] row0Char = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int [] row1Char = new int[]{0,1,3,4,0,0,0,0,0,0,0,0,0,0,0};
        int [] row2Char = new int[]{0,8,dices[0],5,3,4,0,1,3,4,0,0,0,0,0};
        int [] row3Char = new int[]{0,11,3,9,0,5,3,7,dices[3],8,0,0,0,0,0};
        int [] row4Char = new int[]{0,0,0,0,0,8,0,11,3,9,0,1,3,4,0};
        int [] row5Char = new int[]{0,0,0,0,0,8,0,0,0,0,0,8,dices[5],8,0};
        int [] row6Char = new int[]{0,0,0,0,0,8,0,0,0,0,0,11,2,9,0};
        int [] row7Char = new int[]{0,1,3,4,0,8,0,0,0,0,0,0,8,0,0};
        int [] row8Char = new int[]{0,8,dices[1],5,3,7,0,0,1,3,3,3,7,0,0};
        int [] row9Char = new int[]{0,11,3,9,0,5,3,3,9,0,0,0,8,0,0};
        int [] row10Char = new int[]{0,0,0,0,0,8,0,0,0,0,0,0,8,0,0};
        int [] row11Char = new int[]{0,0,0,0,0,8,0,1,3,4,0,1,10,4,0};
        int [] row12Char = new int[]{1,3,4,0,0,5,3,7,dices[4],8,0,8,dices[6],8,0};
        int [] row13Char = new int[]{8,dices[2],5,3,3,9,0,11,3,9,0,11,3,9,0};
        int [] row14Char = new int[]{11,3,9,0,0,0,0,0,0,0,0,0,0,0,0};


        for(int rows = 0; rows < maxrows; rows++){
            for(int column = 0; column < maxColoumns; column++){
                // put your logic here
                // remember to use print and not println

                switch (rows){
                    case 0:
                        color = row0Color[column];
                        printChar = charSet[row0Char[column]];
                        break;
                    case 1:
                        color = row1Color[column];
                        printChar = charSet[row1Char[column]];
                        break;
                    case 2:
                        color = row2Color[column];
                        printChar = charSet[row2Char[column]];
                        break;
                    case 3:
                        color = row3Color[column];
                        printChar = charSet[row3Char[column]];
                        break;

                    case 4:
                        color = row4Color[column];
                        printChar = charSet[row4Char[column]];
                        break;
                    case 5:
                        color = row5Color[column];
                        printChar = charSet[row5Char[column]];
                        break;
                    case 6:
                        color = row6Color[column];
                        printChar = charSet[row6Char[column]];
                        break;
                    case 7:
                        color = row7Color[column];
                        printChar = charSet[row7Char[column]];
                        break;
                    case 8:
                        color = row8Color[column];
                        printChar = charSet[row8Char[column]];
                        break;
                    case 9:
                        color = row9Color[column];
                        printChar = charSet[row9Char[column]];
                        break;
                    case 10:
                        color = row10Color[column];
                        printChar = charSet[row10Char[column]];
                        break;
                    case 11:
                        color = row11Color[column];
                        printChar = charSet[row11Char[column]];
                        break;
                    case 12:
                        color = row12Color[column];
                        printChar = charSet[row12Char[column]];
                        break;
                    case 13:
                        color = row13Color[column];
                        printChar = charSet[row13Char[column]];
                        break;
                    case 14:
                        color = row14Color[column];
                        printChar = charSet[row14Char[column]];
                        break;

                }



                switch (color){
                    case 1:
                        System.out.print(ANSI_BLACK + printChar + ANSI_RESET);
                        break;
                    case 2:
                        System.out.print(ANSI_RED + printChar + ANSI_RESET);
                        break;
                    case 3:
                        System.out.print(ANSI_GREEN + printChar + ANSI_RESET);
                        break;
                    case 4:
                        System.out.print(ANSI_YELLOW + printChar + ANSI_RESET);
                        break;
                    case 5:
                        System.out.print(ANSI_BLUE + printChar + ANSI_RESET);
                        break;
                    case 6:
                        System.out.print(ANSI_PURPLE + printChar + ANSI_RESET);
                        break;
                    case 7:
                        System.out.print(ANSI_CYAN + printChar + ANSI_RESET);
                        break;
                    case 8:
                        System.out.print(ANSI_WHITE + printChar + ANSI_RESET);
                        break;
                    default:
                        System.out.print(" ");

                }
                color = 0;
                printChar = "";

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

        System.out.println("50: Pattern 100");
        System.out.println("51: Pattern 101");


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
                case 50:
                    Patter100();
                    break;
                case 51:
                    Patter101();
                    break;

                default:
                    DisplayMenu();
            }
            System.out.println("Enter next menu item:");
        }

    }
}
