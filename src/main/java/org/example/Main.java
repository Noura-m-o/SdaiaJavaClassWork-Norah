package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      //  System.out.printf("Hello and welcome!");

     /*   Scanner = sc = new Scanner(System)
                
                System.out.println("Enter a day :");
        
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Mondayday");
                break;
            case 3:
                System.out.println("Tuseday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Fridayday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
                
                
        
        }
        
        String dayname =switch (day){
            
            case 1 -> ("Sunday");
            case 2 -> ("Monday");
            case 3 -> ("Tuseday");
            case 4 -> ("Wednesday");
            case 5 -> ("Thursday");
            case 6 -> ("Friday");
            case 7 -> ("Saturday");

            default -> "not a day";
        };
        
        */
        /*
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter a day :");

        System.out.println();
        int day =Scanner.nextInt();
        
        if (day >= 1 && day <= 4 || day ==7){
            System.out.println("Work day");

        } else if (day==5||day==6) {

            System.out.println("Off day");


        }else {

            System.out.println("Invalid input");

        }
*/

      /*  Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter a number :");
        int x = Scanner.nextInt();
        System.out.println(x % 2 ==0 ? "even" : "odd");
        */
/*

        Scanner Scanner = new Scanner(System.in);


        int x = (int)(Math.random()*10);
        int y = (int)(Math.random()*10);

        System.out.printf("Whats %d * %d ?",x,y);
        int answer = Scanner.nextInt();
*/
/*
        while (answer == x*y){
            x = (int)(Math.random()*10);
            y = (int)(Math.random()*10);
            System.out.println(x % 2 ==0 ? "even" : "odd");
            System.out.printf("Whats %d * %d ?",x,y);
            answer = Scanner.nextInt();
        }*/
/*
        while (answer != x*y){

            System.out.println("try again");
            System.out.printf("Whats %d * %d ?",x,y);
            answer = Scanner.nextInt();
        }
        System.out.println("correct");


 */

        String password = new String();
        if (password.length() <8){
            System.out.println("weak password");
        }
        else {
            int Digitcount=0;
            int Upppercount=0;
         
            for (int j = 0; j<password.length();j++){

                char c = password.charAt(j);
                if (Character.isUpperCase(c)){

                    Upppercount++;
                } else if (Character.isDigit(c)) {

                    Digitcount++;

                }

            }

            if (Upppercount<2 || Digitcount<2){

                System.out.println("weak password");
            }
            else {
                System.out.println("Strong password");
            }
        }
    }



}