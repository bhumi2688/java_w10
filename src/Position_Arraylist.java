import java.util.ArrayList;

public class Position_Arraylist {

    //program to get the position of a particular element in an arraylist

    // main method
    public static void main (String[]args){
      ArrayList<String> m1 = new ArrayList<String>();
       //create array list
        m1.add("Java");
        m1.add("Perl");
        m1.add("PHP");
        m1.add("Ruby");
        m1.add("Python");

        //print result
        System.out.println("Index of 'Perl' : " +m1.indexOf("Perl"));
        System.out.println("Index of 'PHP' : " +m1.indexOf("PHP"));
        System.out.println("Index of 'Ruby' : " +m1.indexOf("Ruby"));


    }


}
