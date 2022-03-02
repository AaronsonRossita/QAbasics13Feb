package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {
//          psvm
    public static void main(String[] args) {
//          sout
//        System.out.println("Rossita");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int newInt1;
        newInt1 = 10;

//  datatype address  value
        int newInt2 = 15;
        int newInt3 = 8, newInt4 = 7, newInt5 = 9;

        double newDouble1 = 2.3;
        double newDouble2 = 3; // 3.0
        double newDouble3 = 6.7, newDouble4 = 7.9;

        boolean newBoolean1 = true;
        boolean newBoolean2 = false;

        char newChar1 = 'a';
        char newChar2 = '@';


        String newString1 = "This is my string";
        String newString2 = "^&**&*56757";
        String newString3= "Word";
        String newString4 = "#", newString5 = "1 + 2";

        newString3.length(); // = 4

        int result1 = 1 + 2, result2 = 1 - 2, result3 = 1 * 2, result4 = 1 / 2;
        int result5 = newInt1 + 2, result6 = newInt2 + newInt3;

        String newString6 = "Hi " + "How " + "Are " + "You";
        String newString7 = newString6 + " ?";
        String newString8 = newString6 + newString7;

        String name1 = "Rossssssssita";
        String name2 = "Suzan";
        String number = "" + 5;
//        System.out.println("Hello dear " + name1 +  ". We are happy that you are here");
//        System.out.println("Hello dear " + name2 +  ". We are happy that you are here");
//        System.out.println(newInt1 + 2); // 10 + 2 = 12
//        System.out.println("" + newInt1 + 2); // "10" + "2"
//        System.out.println(newInt1 + " + " + 2); // "10" + "! " + "2"

        int x = 4, y = 9, z = 0;
//        System.out.println(x + y);
//        System.out.println("" + x + y);
//        System.out.println("x + y = " + x + y);
//        System.out.println("x + y = " + (x + y));
//        System.out.println(x + " + " + y);
//        System.out.println(x + y + " mahrozet");
//        System.out.println(x + y + " + " + z);
//        System.out.println("" + x * y);
//
//        System.out.println("Rossita \nAaronson ");
//        System.out.println(" \\ ");
//        System.out.println(" \" ");
//        System.out.println(" \' ");

        int intRegular = 1;
        int[] intArray = {1,2,3,4,5,6,7,8};
//                                index       0    1    2    3    4
        int[] intArrayEmpty = new int[4]; //{ 0,   0  , 0 ,  0 }

//        System.out.println(intArrayEmpty[0]);
//        System.out.println(intArrayEmpty[1]);
//        System.out.println(intArrayEmpty[2]);
//        System.out.println(intArrayEmpty[3]);
////        System.out.println(intArrayEmpty[4]);   out of bounds
//        System.out.println("----------------");

        intArrayEmpty[0] = 23;
        intArrayEmpty[1] = intRegular;
        intArrayEmpty[2] = 3 + 4;
        intArrayEmpty[3] = intArrayEmpty[0] + intArrayEmpty[2];

//        System.out.println("After numbers");
//        System.out.println(intArrayEmpty[0]);
//        System.out.println(intArrayEmpty[1]);
//        System.out.println(intArrayEmpty[2]);
//        System.out.println(intArrayEmpty[3]);

        double doubleRegular = 1.3;
        double[] doubleArray = {1.3,6.7,9.3};

        boolean booleanRegular = true;
        boolean[] booleanArray = {true,false};

        char charRegular = 'a';
        char[] charArray = {'a','b','c'};

        String stringRegular = "abc";
//                     index      0     1     2
        String[] stringArray = {"abc","def","ghi"};

//        System.out.println(stringArray[0]);
//        System.out.println(stringArray[1]);
//        System.out.println(stringArray[2]);
//        System.out.println(stringArray.length);
//
//        for (int i = 0; i < stringArray.length; i++) {
//            System.out.print(stringArray[i] + ", ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < stringArray.length; i++) {
//            System.out.println(stringArray[i] + ", ");
//        }
//
//        for (int i = 0; i < 15; i++) {
//            // i < 15
//            System.out.println("i = " + i);// 0 1 2 3 4 ....
//            // i++
//        }
//
//        for (int i = 0; i < intArrayEmpty.length; i++) { // i++ same as i = i + 1
//            System.out.println("i = " + i);
//            System.out.println(intArrayEmpty[i]);
//        }
//
//        for (int i = 0; i < stringArray.length; i++) {
//            System.out.println(stringArray[i]);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("***");
//        }
//
//        String word = "";
//
//        // 1
//        word = stringArray[0];
//        System.out.println(word);
//        // 2
//        word = stringArray[1];
//        System.out.println(word);
//        // 3
//        word = stringArray[2];
//        System.out.println(word);
//
//        for (String word : stringArray) {
//            System.out.println(word);
//        }
//
//        for (int n : intArray) {
//            System.out.println("n = " + n);
//        }

//        int something = 3;
//
//        while (something < 10){
//            System.out.println("*");
//            something++;
//        }
//
//        System.out.println("!");
//
//        System.out.println("Please write a number");
//        int h = scanner.nextInt();
//        System.out.println("The number that i got is = " + h);

        int a = random.nextInt(20);
        System.out.println("Please guess the number");
        int b = scanner.nextInt();

        while (b != a){
            System.out.println("try again");
            b = scanner.nextInt();
        }

        System.out.println("Hooray you guessed it");
















    }

}



