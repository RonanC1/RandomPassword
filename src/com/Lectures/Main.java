package com.Lectures;

import java.util.Scanner;
public class Main{
    public static void main(String[] argcs)
    {
        System.out.println("How many characters long would you like your password to be?");
        //Scanner inNum = new Scanner(System.in);
        int length = 0;
        do{
            if(length < 8){
            System.out.println("You must pick at least 8 or more characters: ");
            Scanner inNum = new Scanner(System.in);
            length = inNum.nextInt();
            }
            else if(length > 26){
              System.out.println("You must pick 25 or less characters");
            }

        }
        while(length < 8);

        int random = 0;
        char lower;
        char upper;
        char number;
        char charac;
        String password = "";

        for(int i = 0; i < length; i++)
        {
            random = (int)(Math.random()*4+1);
            switch(random)
            {
                case 1: lower = (char)(Math.random()*26 + 97);//122 - 97 = 25 + 1......+97
                    password += lower;
                    break;
                case 2: upper = (char)(Math.random()*26 + 65);//90 - 65 = 25 + 1...... + 65
                    password += upper;
                    break;
                case 3: number = (char)(Math.random()*10 + 48);//57 - 48 = 9 + 1...... + 48
                    password += number;
                    break;
                case 4: charac = (char)(Math.random()*15 + 33);//47 - 33 = 14 + 1.....+33
                    password += charac;
                    break;
            }
        }
        System.out.printf("Your new random password = %s\n", password);
    }
}