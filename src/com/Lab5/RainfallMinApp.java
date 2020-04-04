package com.Lab5;

import java.util.Scanner;

public class RainfallMinApp {
    public static void main(String[] args) {

        double[][] rainfall;
        rainfall = new double[4][7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of weeks: ");
        int weeks = sc.nextInt();
        System.out.println("Please enter number of days per week: ");
        int days = sc.nextInt();

        rainfall = new double[weeks][days];

        for(int row = 0; row < rainfall.length; row++){
            for(int col = 0; col < rainfall[row].length; col++){
                System.out.println("Enter rainfall value for week "
                + (row + 1) + " and day " + (col + 1) + ": ");
                rainfall[row][col] = sc.nextDouble();
            }
        }

        //processing
        //calculate min value of rainfall[]
        double min = rainfall[0][0];
        //traverse the 2D [] using outer and inner loop
        for(int row = 0; row < rainfall.length; row++){
            for(int col = 0; col < rainfall[row].length; col++){
                if(min > rainfall[row][col]){
                    min = rainfall[row][col];
                }
            }
        }//end for

        System.out.println("Min is: " + min);

    }//end main
}//end class
