import java.sql.SQLOutput;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {
   Integer addition(Integer a, Integer b){
       if(a==null) {
           a=Validations.ValidateInt();
       }
       if(b==null) {
           b=Validations.ValidateInt();
       }
       return a+b;
   }
    Integer substraction(Integer a, Integer b){
        if(a==null) {
            a=Validations.ValidateInt();
        }
        if(b==null) {
            b=Validations.ValidateInt();
        }
        return a-b;
    }
    Integer division(Integer a, Integer b){
        if(a==null) {
            a=Validations.ValidateInt();
        }
        if(b==null) {
            b=Validations.ValidateIntNotZero();
        }
        return a/b;
    }
    Integer multiplication(Integer a, Integer b){
        if(a==null) {
            a=Validations.ValidateInt();
        }
        if(b==null) {
            b=Validations.ValidateInt();
        }
        return a*b;
    }
    Integer modulo(Integer a, Integer b){
        if(a==null) {
            a=Validations.ValidateInt();
        }
        if(b==null) {
            b=Validations.ValidateInt();
        }
        return a%b;
    }
    void  basicOperations(Integer a, Integer b){
        if(a==null) {
            a=Validations.ValidateInt();
        }
        if(b==null) {
            b=Validations.ValidateIntNotZero();
        }
        System.out.println("Sum: "+ addition(a,b));
        System.out.println("Subtraction: "+ substraction(a,b));
        System.out.println("Multiplication: "+ multiplication(a,b));
        System.out.println("Divison: "+ division(a,b));
        System.out.println("Modulo: "+modulo(a,b));
    }
    void swap(Integer a, Integer b){
        if(a==null) {
            a=Validations.ValidateInt();
        }
        if(b==null) {
            b=Validations.ValidateIntNotZero();
        }
        Integer c=a;
        a = b;
        b=c;
        System.out.println("a:"+a);
        System.out.println("b"+b);
    }
     void getString(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a string");
        StringBuilder sb = new StringBuilder();
        sb.append(inp.nextLine());
        System.out.println("The reversed string is:"+System.lineSeparator()+ sb.reverse());
    }
    void countChars(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a string");
        String input =inp.nextLine();
        Pattern patternaz = Pattern.compile("[a-zA-Z]");
        Pattern patternnr = Pattern.compile("\\d");
        Pattern patternsp = Pattern.compile("\\W\\D");
        Matcher alphamatcher = patternaz.matcher(input);
        Matcher nrmatcher=patternnr.matcher(input);
        Matcher spmatcher = patternsp.matcher(input);
        long ctalpha = alphamatcher.results().count();
        long ctnum = nrmatcher.results().count();
        long ctsp = spmatcher.results().count();
        System.out.println("Alphabetical: "+ctalpha);
        System.out.println("Numerical: "+ctnum);
        System.out.println("Non Alphanumerical: "+ctsp);

    }
    void printNaturals()
    {
        System.out.println("How many numbers do you want to print?");
        Integer a = Validations.ValidateInt();
        System.out.println("First " + a +" natural numbers are:");
        for(Integer i=0;i<a;i++){
            System.out.println(i);
        }
    }
    void assessSign(){
        System.out.println("Input your number");
        Integer a=Validations.ValidateInt();
        if(a<0)
            System.out.println(a +"is negative");
        else System.out.println(a +"is positive");
    }
    void sumNaturals()
    {
        System.out.println("How many numbers do you want to print?");
        Integer a = Validations.ValidateInt();
        System.out.println("First " + a +" natural numbers are:");
        Integer sum=0;
        for(Integer i=0;i<a;i++){
            System.out.println(i);
            sum = addition(sum,i);
        }
        System.out.println("Sum of first "+a+" numbers is: " +sum);

    }
}
