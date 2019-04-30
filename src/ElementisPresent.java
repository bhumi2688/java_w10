import java.util.ArrayList;

public class ElementisPresent {

    // program to check whether the given element is present in an arraylist or not
    // main method
    public static void main (String[]args){
        //create an object
        ArrayList<String> c1 = new ArrayList<String>();
        //Add element to arraylist
           c1.add("Java");
           c1.add("Perl");
           c1.add("Ruby");
           c1.add("PHP");

           System.out.println(c1.contains("Perl")); //will print true
           System.out.println(c1.contains("Python")); // will print false


    }












}
