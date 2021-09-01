package com.company;

public class Main {

    public static void main(String[] args) {
    int found_time = 0;
    int greatest_value = 0;
    for (int t = 0; t <= 100; t++){
        int bacteria = t*(t-20)*(t-100) + 120000;
        int previous_bacteria = (t-1)*((t -1) - 20) * ((t - 1) - 100) + 120000;
        int difference = bacteria - previous_bacteria;
        if (difference > greatest_value) {
            greatest_value = difference;
            found_time = t;
        }
    }
        System.out.println("The difference of the bacteria: " + greatest_value + " The time is: " + found_time);



    }
}
