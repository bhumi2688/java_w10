import java.util.Arrays;

public class ReverseInteger_Value {
    // Program to reverse an array of integer value
    // main method
    public static void main(String[] args) {
        //enter int value
        int[] a = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // it will print array before reverse
        System.out.println("Array before reverse");
        for(int i = 0; i < a.length; i++){

            System.out.println(a[i] + "");
        }
     for(int i = 0, j = a.length -1; i <j; i++, j--){
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
     }
     //print array after reverse
     System.out.println("\nArray after reverse");
     for(int i = 0; i < a.length; i++){
         System.out.println(a[i] + " ");

     }



    }


}