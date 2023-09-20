import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        int a = 5;
        int b = 10;
        System.out.println("initially a is:" + a + " and b is:" + b);
        System.out.println("Now switching values between a & b");
//        switch values with 3rd argument
//        int c=b;
//        b=a;
//        a=c;

        // Switch values without 3rd argument
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Now a is:" + a + " and b is:" + b);
        System.out.println();
//  adding file to github

        // Homework
        Scanner scanner = new Scanner(System.in);

        // Exercise 1 - get 3 numbers , show there sum and average
        System.out.println("please enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("please enter 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println("please enter 3rd number:");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        float avg = sum / 3;

        System.out.println("sum of 3 number is: " + sum + " and average is: " + avg);


        // Exercise 2 - get a room width and height - Show its area and perimeter

        // Exercise 3 - get a movie length in minutes - show in hours and minutes

    }
}