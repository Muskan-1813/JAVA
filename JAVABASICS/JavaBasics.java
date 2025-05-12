
import java.util.*;
public class JavaBasics {
    public static void main(String args[]){
        System.out.print("Hello World\n"); //line space due to \n
        System.out.println("Hello World"); //line space
        System.out.println("Hello World"); //line space
        System.out.println("Hello World"); //line space
        

        //Let's Print a Pattern
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");


        //Variables in Java

        int a=10;
        int b=5;
        String name= "Muskan";
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);

        //Data Types in java
        //Primitive data types(8):Already existing in java
        //Non-primitive data types:Created by ourselves

        //PRIMITIVE DATA TYPES
        byte box = 8;            //1 byte
        System.out.println(b);
        char ch ='a';            //2 bytes
        System.out.println(ch);
        boolean var =false;      //1 byte
        float price = 10;      // 4 bytes
        System.out.println(price);
        int number =25;          //4 bytes
        //long                   //8 bytes
        //double                 //8 bytes
        short n =240;            //2 bytes

        //SUM OF TWO NUMBERS
        int at=6;
        int bc=12;
        int sum=at+bc;
        System.out.println(sum);

        //INPUT 
        Scanner sc = new Scanner(System.in);
        /*String input=sc.next();        //Only word before 1st space
        System.out.println(input);

        String name1=sc.nextLine();     //The entire line
        System.out.println(name1);

        int num = sc.nextInt();         //The number
        System.out.println(num);
       
        float price1 = sc.nextFloat();  //Float number
        System.out.println(price1);

        boolean we = sc.nextBoolean();  //Boolean 
        System.out.println(we);

        short sa = sc.nextShort();
        System.out.println(sa);*/

        //Sum and product of two numbers after input
        int not = sc.nextInt();
        int pot =sc.nextInt();
        int sum12 = not+pot;
        System.out.println(sum12);
        int prod = not*pot;
        System.out.println(prod);

       
        /*TYPE CONVERSION(IMPLICIT CONVERSION)
        Type Compatible
        destination type>souce type
        byt->short->int->float->long->double
        */

        /*TYPE CASTING(EXPLICIT/NAAROWING CONVERSION)
        Irrespectice of loss of data we convert the data into another type
        */
        float a7=25.12f;
        //int b7=a7; (error due to lossy conversion)
        int b7=(int)a7; //converts iirespective of lossy conversion
        System.out.println(b7);

        char ch1='a';
        int output=ch1;
        System.out.println(output);//Prints the ASCII value
        




    }
}
//boilerplate code