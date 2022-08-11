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
                case 1: {
                    try{
                        operations.addNumbers();
                    }
                    catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        operations.addNumbers();
                    }
                    break;

                }
                case 2: {try {
                    operations.divNumbers();
                }
                catch (RuntimeException e){
                    System.out.println(e.getMessage());
                    operations.divNumbers();
                }
                break;

                }
                case 3: {
                    try {
                        operations.multNumbers();
                    }
                    catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        operations.multNumbers();
                    }
                    break;
                }
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
