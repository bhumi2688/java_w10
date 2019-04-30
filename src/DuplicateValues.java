public class DuplicateValues {
    // program to find the duplicate values of an array of integer value

    // main method
    public static void main (String[]args){
        //Enter int value
        int [] a = {2, 9,  4, 5, 6, 7, 7, 9};
        //loop will create
        for (int i = 0; i< a.length-1; i++){
            // initialised int j
            for (int j = i+1; j< a.length; j++){
                // used logical && operator
                if((a[i] == a[j]) && (i != j)){
                    //duplicate element will print
                    System.out.println("Duplicate Element : " + a[j]);
                }
            }


        }
    }




}
