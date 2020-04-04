package com.Lab5;

public class RainfallAvgMaxMin {
    //declare instantiable variables
    private int[][] rainfall;
    private double average;
    private int max;
    private int min;

    public RainfallAvgMaxMin(){
    }

    public void setRainfall(int[][] rainfall) {
        this.rainfall = rainfall;
    }

    public double getAverage() {
        return average;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    //calculate average

    public void calcAverage(){
        int sum = 0;
        int counter = 0;

        for(int i = 0; i < rainfall.length; i++){
            for(int j = 0; j < rainfall[i].length; j++){
                sum = sum + rainfall[i][j];
                counter++;
            }
        }//end for

        average = (double) sum / counter;
    }

    //calculate max
    public void calcMax(){
        max = rainfall[0][0];
        for(int i = 0; i < rainfall.length; i++){
            for(int j = 0; j < rainfall[i].length; j++){
                if(max < rainfall[i][j]){
                    max = rainfall[i][j];
                }
            }
        }//end for
    }

    //calculate min
    public void calcMin(){
        min = rainfall[0][0];
        for(int i = 0; i < rainfall.length; i++){
            for(int j = 0; j < rainfall[i].length; j++){
                if(min > rainfall[i][j]){
                    min = rainfall[i][j];
                }
            }
        }//end for
    } //end method

}//end class
