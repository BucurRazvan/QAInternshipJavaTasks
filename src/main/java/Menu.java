

public class Menu {
    Operations operations=new Operations();
    Integer option;
    void display(){
        System.out.println("Available Operations");
        System.out.println();
        System.out.println("[1] Add two numbers" + System.lineSeparator() +"[2] Subtract two numbers"+ System.lineSeparator() + "[3] Divide 2 numbers" + System.lineSeparator()+ "[4]Multiply 2 numbers"+System.lineSeparator()+ "[5]Basic operations with 2 numbers");
        System.out.println("[6] Swap a and b" + System.lineSeparator()+"[7] Reverse a string" +System.lineSeparator()+"[8]Count characters in a string"+System.lineSeparator()+"[9] Display first n natural numbers"+System.lineSeparator()+"[10] Assess sign");
        System.out.println("[11] Sum of first n numbers");

        option = Validations.ValidateIntChoice();
        while(option !=0)
        {
            switch (option) {
                case 1 -> System.out.println(operations.addition(null, null));

                case 2 -> System.out.println(operations.substraction(null,null));

                case 3 -> System.out.println(operations.division(null,null));
                case 4 -> System.out.println(operations.multiplication(null,null));
                case 5 -> operations.basicOperations(null,null);
                case 6 -> operations.swap(null,null);
                case 7 -> operations.getString();
                case 8 -> operations.countChars();
                case 9 -> operations.printNaturals();
                case 10 ->operations.assessSign();
                case 11->operations.sumNaturals();
                default -> System.out.println("Please select a valid option!");

            }
            option=Validations.ValidateIntChoice();

        }
        System.out.println("Shutting down...");

    }



}
