import java.util.Arrays;

public class Specific_Position {

    //Program to insert an element(Specific position) into an array

    // main method
    public static void main (String[]args){
        //Entered int value
        int[] array = {34, 45, 76, 21, 39,100,120};

        //insert an element in 2nd position of the array(index->2, value->5)

        int Index_position = 2;
        int newValue = 5; // new value to be printed

        System.out.println("Original Array : " + Arrays.toString(array));

        for( int i = array.length-1; i >Index_position; i-- ){
            array[i] = array[i-1];
        }

        array[Index_position ] = newValue;
        //new value will print
        System.out.println("New Array : " +Arrays.toString(array));


    }

}
