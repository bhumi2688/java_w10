public class Ascending_Order {

    //Program to enter array and sort the values in ascending order
    // main method
    public static void main(String[]args){
        //initialise array
        int[]a = new int[]{5,2,8,7,1};
        int temp = 0;

        //Display elements of original array
        System.out.println("Elements of original array: ");
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i] + " ");
        }

        // sort the array in ascending order
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

       System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order");
        for (int i = 0;i<a.length;i++){

        }

    }









}
