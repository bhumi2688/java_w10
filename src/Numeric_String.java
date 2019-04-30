import java.util.Arrays;

public class Numeric_String {

    //Program to sort a numeric array and a string array
    // main method

    public static void main (String[]args){

        int [] array1 = {123,789,976,456,222}; // int value
        String[] array2 = {"Good Luck", "Congrates", "Hurray", "Excellent"};// string name


        System.out.println("Original int array : " + Arrays.toString(array1));
        Arrays.sort(array1);// method for sort , toString = all values within the array will print
        System.out.println("Sorting int array :" + Arrays.toString(array1));

        System.out.println("original String array :" + Arrays.toString(array2));
        Arrays.sort(array2);// method for sort, toString=all values within the array will print
        System.out.println("Sorting String array :" + Arrays.toString(array2));


    }

}
