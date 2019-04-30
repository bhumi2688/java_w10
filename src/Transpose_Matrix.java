public class Transpose_Matrix {

    // Write 2-D array and WAP to transpose matrix(row value should be transposed to column and coloumn in row)
    //main method
    public static void main(String[]args){

        //create matrix
        int original[][] ={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Printing matrix without transpose");
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++ ){
                //will print before transpose
                System.out.println(original[a][b] + " ");

            }
            System.out.println();

        }

        System.out.println("Printing matrix after transpose");
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                //will print after transpose
                System.out.println(original[b][a] + " ");
            }
        }

    }









}
