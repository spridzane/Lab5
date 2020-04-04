package com.Lab5;

import java.util.Scanner;

public class RainfallMaxApp {
    public static void main(String[] args) {
        //declare 2D []
        double rainfall[][];
        //set the size for 4 weeks and 7 days
        rainfall = new double[4][7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of weeks: ");
        int weeks = sc.nextInt();
        System.out.println("Please enter number of days per week: ");
        int days = sc.nextInt();

        //create a 2D [] with as many rows as user provided for weeks
        //as many columns as user provided for days
        rainfall = new double[weeks][days];

        //input
        //traverse the 2D [] by using loop
        //store the values provided by the user
        for(int row = 0; row < rainfall.length; row++){
            for(int col = 0; col < rainfall[row].length; col++){
                System.out.print("Enter rainfall value for week: "
                        + (row + 1) + " day " + (col + 1) + ": ");
                rainfall[row][col] = sc.nextDouble();
            }
        }//end for
        //processing
        //calculate the maximum value in the []
        double max;
        max = rainfall[0][0];

        //traverse the 2D [] using outer and inner loop
        for(int row =0; row < rainfall.length; row++){
            //retrieve the current row, located at the index given by value of the row
            double[] r = rainfall[row];
            //traverse all the element of current row
            for(int col = 0; col < r.length; col++){
                //if the value of max variable is lower than the current element from the rainfall[]
                //then update the max with that element
                if(max < rainfall[row][col]){
                    //a new max value has been found
                    max = rainfall[row][col]; //store the value of current element in the max
                    //the previous value of the max variable is replaced
                }//end if
            }//inner loop
        }//outer loop

        //output
        System.out.println("Max is: " + max);

    }//end main
}//end class
