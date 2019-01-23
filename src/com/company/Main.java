//Create a new project in IntelliJ IDEA named ArrayPractice
//Initialize your project as a Git repository and be sure to add and commit all changes as you work
//Declare an array named dailyAverageTemp
//Instruct the user to input daily average temperatures (in degrees Fahrenheit) for 7 days
//Each time the user inputs a value, add it to your dailyAverageTemp array

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputTemp = new Scanner(System.in);
	    double [] dailyAverageTemp = new double[7];
	    double [] dailyAverageTempCelsius = new double[7];
	    String promptDay1 = "Please enter the average Fahrenheit temperature for Monday";
        String promptDay2 = "Please enter the average Fahrenheit temperature for Tuesday";
        String promptDay3 = "Please enter the average Fahrenheit temperature for Wednesday";
        String promptDay4 = "Please enter the average Fahrenheit temperature for Thursday";
        String promptDay5 = "Please enter the average Fahrenheit temperature for Friday";
        String promptDay6 = "Please enter the average Fahrenheit temperature for Saturday";
        String promptDay7 = "Please enter the average Fahrenheit temperature for Sunday";
        int days = 7;
        double sum = 0;
        double avg = 0;
        double avgCelsius = 0;

        
        for(int count = 1; count <= days; count++){
            switch(count){
                case 1:
                    System.out.println(promptDay1);
                    double usrInput1 = inputTemp.nextInt();
                    dailyAverageTemp[0] = usrInput1;
                    break;
                case 2:
                    System.out.println(promptDay2);
                    double usrInput2 = inputTemp.nextInt();
                    dailyAverageTemp[1] = usrInput2;
                    break;
                case 3:
                    System.out.println(promptDay3);
                    double usrInput3 = inputTemp.nextInt();
                    dailyAverageTemp[2] = usrInput3;
                    break;
                case 4:
                    System.out.println(promptDay4);
                    double usrInput4 = inputTemp.nextInt();
                    dailyAverageTemp[3] = usrInput4;
                    break;
                case 5:
                    System.out.println(promptDay5);
                    double usrInput5 = inputTemp.nextInt();
                    dailyAverageTemp[4] = usrInput5;
                    break;
                case 6:
                    System.out.println(promptDay6);
                    double usrInput6 = inputTemp.nextInt();
                    dailyAverageTemp[5] = usrInput6;
                    break;
                case 7:
                    System.out.println(promptDay7);
                    double usrInput7 = inputTemp.nextInt();
                    dailyAverageTemp[6] = usrInput7;
                    break;
            }
        }

        System.out.println("Daily Average in Fahrenheit: ");
        for(double i: dailyAverageTemp){
            System.out.println(i);
        }

        for(double i: dailyAverageTemp){
            sum += i;
            avg = sum / dailyAverageTemp.length;
        }
        System.out.println("Weekly Average is: " + avg);

        System.out.println("Daily Average converted to Celsius is: ");
        for(int i = 0; i < dailyAverageTemp.length; i++){
            dailyAverageTempCelsius[i] = ((dailyAverageTemp[i] - 32)/ 1.8);
            System.out.println(dailyAverageTempCelsius[i]);
        }

        avgCelsius = ((avg - 32) / 1.8);
        System.out.print("Weekly average converted to Celsius: " + avgCelsius);

    }
}
