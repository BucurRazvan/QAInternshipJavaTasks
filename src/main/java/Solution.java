import java.util.Scanner;

public class Solution {

    String name;
    void printName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = in.nextLine();
        System.out.println("Hello " + name);
    }

    void addNumbers() throws RuntimeException {
        System.out.println("Add two numbers");
        System.out.println("Please enter the first number");
        Scanner inOne = new Scanner(System.in);
        int a , b ;

        if (inOne.hasNextInt()) {
            a = inOne.nextInt();
        } else {
            throw new RuntimeException("Not a number");
        }
        System.out.println("Please enter the second number");
        if (inOne.hasNextInt()) {
            b = inOne.nextInt();
        } else {
            throw new RuntimeException("Not a number");
        }
        System.out.println("The sum is: " + (a + b));
    }

    void divNumbers() throws RuntimeException{
        System.out.println("Divide two numbers");
        System.out.println("Please enter the first number");
        Scanner inOne = new Scanner(System.in);
        int a , b ;

        if (inOne.hasNextInt()) {
            a = inOne.nextInt();
        } else {
            throw new RuntimeException("Not a number");
        }
        System.out.println("Please enter the second number");
        if (inOne.hasNextInt()) {
            b = inOne.nextInt();
        } else {
            throw new RuntimeException("Not a number");
        }
        if(b == 0)
        {
            throw  new RuntimeException("Division by 0 is not allowed");
        }
        System.out.println("The result is: " + (a / b));
    }

    void multNumbers() throws RuntimeException{
        System.out.println("Multiply two numbers");
        System.out.println("Please enter the first number");
        Scanner inOne = new Scanner(System.in);
        int a , b ;

        if (inOne.hasNextInt()) {
            a = inOne.nextInt();
        } else {
            throw new RuntimeException("Not a number");
        }
        System.out.println("Please enter the second number");
        if (inOne.hasNextInt()) {
            b = inOne.nextInt();
        } else {
            throw new RuntimeException("Not a number");
        }
        System.out.println("The result is: " + (a * b));
    }
}

