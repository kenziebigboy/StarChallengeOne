package com.mastercoding;

public class Main {

    public static void main(String[] args) {


        // get started read the README file
        // there is a patters file with images of all the patters in it

        // code format
        // use 2 for loop like below

        // You can use System.out.print("*"); to print *
        // and you can use System.out.print(" "); for space
        // you can use anything we learned: if-else-then, switch, int counter
        // thing you can not do is System.out.print("*   *   *  **");
        // you need to generate the patterns
        // I don't know why this is not pushing

        // Copy code below and un-comment it

        // https://youtu.be/zHeALVxsdkw

        /*

        System.out.println("Name: ");
        System.out.println("Status: ");
        System.out.println();
        int maxrows     = 15;
        int maxColoumns = 15;

        for(int rows = 0; rows < maxrows; rows++){
            for(int column = 0; column < maxColoumns; column++){
                // put your logic here
                // remember to use print and not println

            }
            System.out.println();
        }

        */

//        System.out.println("Name: ");
//        System.out.println("Status: ");
//        System.out.println();
/*

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
*/
/*

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
*/





/*

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
*/



        System.out.println("Name: ");
        System.out.println("Status: ");
        System.out.println();
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
}
