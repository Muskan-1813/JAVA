import java.util.*;
public class INPUT {
    public static void main(String[] args) {
        //INPUT 
        Scanner sc = new Scanner(System.in);
        String input=sc.next();        //Only word before 1st space
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
        System.out.println(sa);

        //Sum and product of two numbers after input
        int not = sc.nextInt();
        int pot =sc.nextInt();
        int sum12 = not+pot;
        System.out.println(sum12);
        int prod = not*pot;
        System.out.println(prod);

        

    }
}
