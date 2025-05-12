public class Type_Conversion {
    public static void main(String[] args) {
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
       
        
