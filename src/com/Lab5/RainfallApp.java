package com.Lab5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class RainfallApp {
    public static void main(String[] args) {
        //declare local variables
        int[][] rain;
        rain = new int[4][7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of weeks: ");
        int weeks = sc.nextInt();
        System.out.println("Please enter number of days per week: ");
        int days = sc.nextInt();
        System.out.println("===============");

        rain = new int[weeks][days];

        for(int i = 0; i < rain.length; i++){
            for(int j = 0; j < rain[i].length; j++){
                System.out.println("Enter rainfall value for week "
                + (i+1) + " day " + (j+1) + ": ");
                rain[i][j] = sc.nextInt();
            }
        }//end for

        //processing
        RainfallAvgMaxMin results = new RainfallAvgMaxMin();
        results.setRainfall(rain);
        results.calcAverage();
        double a = results.getAverage();
        DecimalFormat df2 = new DecimalFormat("#.##");
        System.out.println("Average is: " + df2.format(a));
        results.calcMax();
        int b = results.getMax();
        System.out.println("Max is: " + b);
        results.calcMin();
        int c = results.getMin();
        System.out.println("Min is: " + c);

    }//end main
}//end class
