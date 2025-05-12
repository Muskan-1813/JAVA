
import java.util.*;
public class LOOPS {
    public static void main(String[] args) {
        //While LOOP
        int j =0;
        while (j<=10) { 
            System.out.println("Hey!!");
            j++;                               //Value increases by 1
        }
        System.out.println("Done printing Hey 10 times");
         

         //Print numbers from 1 to 10
         int s =1;
         while (s<=10) { 
             System.out.println(s);
             s++;
         }

         //Print numbers from 1 to n
         int num =1;
         int n=7;
         while (num<=n) { 
             System.out.println(num);
             num++;
         }

         //Print sum of first n1 natural numbers
         int start =1;
         int n1=5;
         int sum=0;
         while (start<=n1) { 
             sum+=start;
             start++;
         }
         System.out.println(sum);
         

         //FOR LOOPS
         //int i=1;
         for (int i = 1; i < 10; i++) {
             System.out.println("Hello world!!");
         }

         /*PRINT SQUARE PATTERN
         ****
         ****
         ****
         *****/
         
        for (int line = 1; line <= 4; line++) {
            System.out.println("****");
        }

        //Print Reverse of a number
           
        int Num=10899;
        int r=0;
        int rev=0;
        while(Num!=0){
             r=Num%10;
             rev=rev*10+r;
             Num/=10;
        }
        System.out.println(rev);
        

        //Do-While Loop
        int counter =1;
        do{
            System.out.println("HeY");
            counter++;
        }while(counter<=10);


        //BREAK statement

        int x=0;
        for (int index = 0; index < 10; index++) {
            if(index==3){
                break;
            }
            System.out.println(index);
        }
        System.out.println("Out of the loop");

        

        //KEEP ENTERING NUMBERS TILL USER ENTER MULTIPLES OF 10
        
        Scanner sc  = new Scanner(System.in);
        do{
            int number= sc.nextInt();
            if(number%10==0){
                break;
            }
            System.out.println(number);
        }while(true);

        
        //CONTINUE STATEMENT
        for (int index1 = 0; index1 < 10; index1++) {
            if(index1==3){
                continue;
            }
            System.out.println(index1);
        }
        System.out.println("Out of the loop");
        

       //CHECK WHETHER A NUMBER IS PRIME OR NOT
       System.out.println("Enter number:");
       int pnum = sc.nextInt();
       int count =0;
       if (pnum==1) {
           System.out.println("Not prime");
       }
       for(int it=2;it<=pnum;it++){
             if(pnum%it==0){
                count++;
             }
       }
       if(count>=2){
        System.out.println("Not prime");
       }
       else{
        System.out.println("prime");
       }
    }
}
