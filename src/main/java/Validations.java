import java.util.Scanner;

public  class Validations {
    static Integer ValidateInt() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a number");
        Integer input = null;
        try {
            input = inp.nextInt();

        } catch (Exception e) {
            input = ValidateInt();
        }
        return input;
    }
    static Integer ValidateIntNotZero() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a number");
        Integer input = null;
        try {
            input = inp.nextInt();

        } catch (Exception e) {
            input = ValidateInt();
        }
        if(input == 0)
        {
            System.out.println("Division by 0 is not allowed");
            input = ValidateIntNotZero();
        }
        return input;
    }
    static Integer ValidateIntChoice() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Select an operation");
        Integer input = null;
        try {
            input = inp.nextInt();

        } catch (Exception e) {
            input = ValidateInt();
        }
        return input;
    }

}

