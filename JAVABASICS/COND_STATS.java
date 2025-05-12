import java.util.*;    //To input the values from the user
public class COND_STATS {
    public static void main(String[] args) {
        // if-else
         int age = 22;
         if (age>=18) {
             System.out.println("adult:drive,vote"); 
         }
         if (age > 13 && age<18){
            System.out.println("teenager");
         }
         else{
            System.out.println("Not adult");
         }

         //Print Largest of two numbers
         int num1=13;
         int num2=29;
         if (num1>num2) {
            System.out.println("Num1 is largest");   
         }
         else{
            System.out.println("Num2 is largest");
         }

         //Print if Number is even or odd

        int num = 4;
        if(num%2==0){
            System.out.println("Num is even");
        }
        else{
            System.out.println("Number is odd");
        }

        //ELSE IF STATEMENTS
        int age1 = 15;
         if (age1>=18) {
             System.out.println("adult:drive,vote"); 
         }
         else if (age1 > 13 && age1<18){
            System.out.println("teenager");
         }
         else{
            System.out.println("Not adult");
         }


         //INCOME TAX CALCULATOR

         Scanner sc = new Scanner(System.in);
         int Income = sc.nextInt();
         int tax;

         if (Income<500000) {
             tax =0;
         }
         else if (Income<500000&&Income>1000000) {
             tax = (int)(Income*0.2);
         }
         else  {
             tax = (int)(Income*0.3);
         }

         System.out.println("Tax is : " + tax);
         

         //PRINT LARGEST OF THREE NUMBERS

         int a=1;
         int b=3;
         int c=6;

         if((a>=b)&&(a>=c)){
            System.out.println("a is largest");
         }

         else if((b>=c)){
            System.out.println("b is largest");
         }
         else{
            System.out.println("c is largest");
         }


         //TERNARY OPERATORS
         //variable = condition?statement1:statement2

         int number = 4;
         String type = ((number%2)==0) ? "even"  : "odd";
         System.out.println(type);


         //CHECK IF A STUDENT WILL PASS OR FAIL

         int marks = 45;
         String Result = (marks>=33) ? "PASS" : "FAIL";
         System.out.println(Result);          //PASS

         //SWITCH STATEMENT
         int Number = 2;
         switch(Number){
            case 1 : System.out.println("MOMOS");
                     break;
            case 2 : System.out.println("BURGER");
                     break;
            case 3 : System.out.println("CHILLI POTATO");
                     break;
            default: System.out.println("GARLIC NOODLES");
         }

         //CALCULATOR
         // Scanner sc = new Scanner(System.in);
         System.out.print("Enter 1st number:");
         int a1 = sc.nextInt();
         System.out.print("Enter 2nd number:");
         int a2 = sc.nextInt();
         System.out.print("Enter Operator:");
         char operator = sc.next().charAt(0);

         switch (operator) {
             case '+':
                 System.out.println(a1+a2);
                 break;
             case '-':
                 System.out.println(a1-a2);
                 break;
             case '*':
                 System.out.println(a1*a2);
                 break;
             case '/':
                 System.out.println(a1/a2);
                 break;
             default:
                 System.out.println("Exit");
                 ;
         }



    }
}
