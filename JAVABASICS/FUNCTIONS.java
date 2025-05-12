public class FUNCTIONS {
    //Function is the reusable part of a code.
     /*FUNCTION WITHOUT PARAMETERS 
    public static void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }*/

    /*FUNCTION WITH PARAMETERS 
    TYPE 1
    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("num1:");
        int num1 = sc.nextInt();
        System.out.print("num2:");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("sum is:" +sum);
    }
    TYPE 2
    public static int caladd(int a,int b){
        int sum = a+b;
        return sum;

    }
    */

    /* CALL BY VALUE
     The change in the value remains only inside this function
    public static void swap(int N,int M){
        int temp =N;
        N=M;
        M=temp;
        System.out.println("N=" +N);
        System.out.println("M="+M);
    }*/
   
    /*RETURN THE PRODUCT OF TWO NUMBERS 
    public static int product(int n1,int n2){
        int prod = n1*n2;
        return prod;
    }*/

    /*FACTORIAL OF A NUMBER*/
    
    public static int fact(int n){
        int fact =1;
        for(int i=n;i>=1;i--){
               fact*=i;
        }
        return fact;
    }
 
    public static void bin_coeff(int n1 ,int r){
        int n_fact=fact(n1);
        int r_fact=fact(r);
        int nmr_fact=fact(n1-r);
        int bin_coeffi=n_fact/(r_fact*nmr_fact);
        System.out.println(bin_coeffi);
    }
    public static void main(String[] args) {
        //printHello();
        //add();

        /*Scanner sc = new Scanner(System.in);
        System.out.print("num1:");
        int a = sc.nextInt();
        System.out.print("num2:");
        int b = sc.nextInt();
        int result = caladd(a, b);
        System.out.println("sum is:" +result);*/

        /*int N=21;
        int M=32;
        swap(N, M);*/

        /*int n1=3;
        int n2=5;
        int product1 = product(n1, n2);
        System.out.println("product is:"+product1);*/
        
        /*int n =5;
        fact(n);*/
       
      bin_coeff(5,2);


        
    }
}
