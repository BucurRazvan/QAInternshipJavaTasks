import java.util.Scanner;

public class Menu {
    Solution operations=new Solution();
    void display(){
        Scanner in = new Scanner(System.in);
        System.out.println("Available Operations");
        System.out.println();
        System.out.println("[1] Add two numbers" + System.lineSeparator() +"[2] Divide Two Numbers" + System.lineSeparator() + "[3] Multiply two numbers"+ System.lineSeparator()+"[0] Exit");
        if(in.hasNextInt())
        {
            int option = in.nextInt();
            System.out.println(option);
            switch(option){
                case 1: operations.addNumbers();
                case 2: operations.divNumbers();
                case 3: operations.multNumbers();
                default:
                    System.out.println("Please choose one of the options");
            }
        }
        else
        {
            System.out.println("Please input a number");
            display();
        }

    }


}
