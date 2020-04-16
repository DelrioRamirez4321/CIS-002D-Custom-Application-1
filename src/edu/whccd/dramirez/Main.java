package edu.whccd.dramirez;

import java.util.Scanner;


/*
THe application is used to be able to tell the gade give to the percentenage give by user.
By: Delrio Ramirez
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numeric integer Grade (0-100): ");
        int numericGrade = sc.nextInt();
        String letterGrade = " ";

        if (numericGrade >= 0 && numericGrade <= 59){
            letterGrade = "F";
            System.out.println( "Letter Grade: " + letterGrade + "\n");
        }
        else if (numericGrade >= 60 && numericGrade <= 69){
            letterGrade = "D";
            System.out.println("Letter Grade: D" + letterGrade + "\n");
        }
        else if (numericGrade >= 70 && numericGrade <= 79){
            letterGrade = "C";
            System.out.println( "Letter Grade: " + letterGrade + "\n");
        }
        else if (numericGrade >= 80 && numericGrade <= 89){
            letterGrade = "B";
            System.out.println( "Letter Grade: " + letterGrade + "\n");
        }
        else if (numericGrade >= 90 && numericGrade <= 100){
            letterGrade = "A";
            System.out.println( "Letter Grade: " + letterGrade + "\n" );
        }
        else {
            System.out.println("Invalid Input!");
        }

        switch (letterGrade){
            case "A":
                System.out.println("Numeric Grade Range: 90-100%");
                break;
            case "B":
                System.out.println( "Numeric Grade Range: 80-89%");
                break;
            case "C":
                System.out.println("Numeric Grade Range: 70-79");
                break;
            case "D":
                System.out.println("Numeric Grade Range: 60-69%");
                break;
            case "F":
                System.out.println("Numeric Grade Range: 0-59%");
                break;

        }
    }
}