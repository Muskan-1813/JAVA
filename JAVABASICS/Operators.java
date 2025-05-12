public class Operators {
    public static void main(String[] args) {

    //ARITHEMATIC OPERATORS
        //Binary Operators(Require 2 Operands)
        int a=10;
        int b=5;
        System.out.println("add = "+(a+b));
        System.out.println("sub = "+(a-b));
        System.out.println("mul = "+(a*b));
        System.out.println("divide = "+(a/b));
        System.out.println("remainder = "+(a%b));

        //Unary Operators (First Operand anything second is always one)

        //Pre-increment
        int c=12;
        int d=++c;
        System.out.println(c);
        System.out.println(d);

        //Post increment
        int e=12;
        int f=e++;
        System.out.println(e);
        System.out.println(f);

        //Pre-decrement
        int c1=12;
        int d1=--c1;
        System.out.println(c1);
        System.out.println(d1);

        //Post decrement
        int e1=12;
        int f1=e1--;
        System.out.println(e1);
        System.out.println(f1);

    //RELATIONAL OPERATORS
       
         int A=10;
         int B=11;
         System.out.println(A==B); //FALSE
         System.out.println(A!=B); //TRUE
         System.out.println(A<B);  //TRUE
         System.out.println(A>B);  //FALSE
         System.out.println(A<=B); //TRUE
         System.out.println(A>=B); //FALSE

    //LOGICAL OPERATORS
        
        /*(&&)LOGICAL AND
           If all the statements in the given expression are TRUE then only the result will be TRUE*/
           System.out.println((3>2)&&(5>0));  //TRUE
           System.out.println((3<2)&&(5>0));  //FALSE
           System.out.println((3>2)&&(5<0));  //FALSE

        /*(||)LOGICAL OR
           If any of the statements in the given expression is TRUE then the result will be TRUE
            if all the conditions are false then the result will be false*/
           System.out.println((3>2)||(5>0));  //TRUE
           System.out.println((3<2)||(5>0));  //TRUE
           System.out.println((3>2)||(5<0));  //TRUE
           System.out.println((3<2)||(5<0));  //FALSE
  
        /*(!)LOGICAL NOT
          If the given expresssion if true then it will give the output as false
          and if it is true then the output will be false */
          
          System.out.println(!(3>2));      //FALSE  
          System.out.println(!(0>5));      //TRUE

    //ASSIGNMENT OPERATORS
         
        int A1=10;
        A1+=10;
        System.out.println(A1);     //A1=20
        

       


    

        


    }
    
}
