public class Sum_ValuesofArray {

    // program to sum values of an array

    // main method
    public static void main (String[]args){

        int array [] = {23,10,12,43};
        int sum = 0;// initialize sum
        // i is variable that variable contains  array
        for (int i  : array)
            sum += i;

        System.out.println(" The sum is " + sum);


    }

}
