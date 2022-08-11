import java.util.Scanner;

public class Solution {

    String name;
    void printName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = in.nextLine();
        System.out.println("Hello " + name);
    }

    void addNumbers() {
        System.out.println("Add two numbers");
        System.out.println("Please enter the first number");
        Scanner inOne = new Scanner(System.in);
        int a = 0, b = 0;

        if (inOne.hasNextInt()) {
            a = inOne.nextInt();
        } else {
            System.out.println("Please Input an integer!");
            addNumbers();
        }
        System.out.println("Please enter the second number");
        if (inOne.hasNextInt()) {
            b = inOne.nextInt();
        } else {
            System.out.println("Please Input an integer!");
            addNumbers();
        }
        System.out.println("The sum is: " + (a + b));
    }

    void divNumbers() {
        System.out.println("Divide two numbers");
        System.out.println("Please enter the first number");
        Scanner inOne = new Scanner(System.in);
        int a = 1, b = 1;

        if (inOne.hasNextInt()) {
            a = inOne.nextInt();
        } else {
            System.out.println("Please Input an integer!");
            divNumbers();
        }
        System.out.println("Please enter the second number");
        if (inOne.hasNextInt()) {
            b = inOne.nextInt();
        } else {
            System.out.println("Please Input an integer!");
            divNumbers();
        }
        System.out.println("The result is: " + (a / b));
    }

    void multNumbers() {
        System.out.println("Multiply two numbers");
        System.out.println("Please enter the first number");
        Scanner inOne = new Scanner(System.in);
        int a = 0, b = 0;

        if (inOne.hasNextInt()) {
            a = inOne.nextInt();
        } else {
            System.out.println("Please Input an integer!");
            multNumbers();
        }
        System.out.println("Please enter the second number");
        if (inOne.hasNextInt()) {
            b = inOne.nextInt();
        } else {
            System.out.println("Please Input an integer!");
            multNumbers();
        }
        System.out.println("The result is: " + (a * b));
    }
}

