/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        myApp.userInput();
    }

    public void userInput() {
        int temp1;
        int temp2;
        int temp3;

        System.out.print("Enter the first number: ");
        temp1 = in.nextInt();
        System.out.print("Enter the second number: ");
        temp2 = in.nextInt();
        if ((temp1 - temp2) == 0) {
            return;
        }
        System.out.print("Enter the third number: ");
        temp3 = in.nextInt();
        if ((temp3 - temp2) == 0) {
            return;
        }
        if ((temp1 - temp3) == 0) {
            return;
        }
        largestNumber(temp1, temp2, temp3);
    }

    public void largestNumber(int temp1, int temp2, int temp3){
        int largestNum = temp1;
        if (temp2 > largestNum){
            largestNum = temp2;
        }
        if (temp3 > largestNum){
            largestNum = temp3;
        }
        System.out.println("The largest number is " + largestNum +".");
    }
}
