import java.util.ArrayList;

public class Comparetwo_Arraylist {

    // program to compare two array list
    // main method
    public static void main(String[]args){
        //create an object
        ArrayList<String> c1 = new ArrayList<String>();
        // add element to arraylist
        c1.add("Java");
        c1.add("Python");
        c1.add("Perl");
        c1.add("Ruby");
        c1.add("PHP");

        //create another object
        ArrayList<String> c2 = new ArrayList<String>();
        //add elements to another arraylist
        c2.add("Java");
        c2.add("Python");
        c2.add("Perl");
        c2.add("PHP");

        //Stroing comparision output in ArrayList<String>
        ArrayList<String>c3 = new ArrayList<String>();
        for(String a: c1)
        c3.add(c2.contains(a) ? "Yes" : "No");
        //print the comparision
        System.out.println(c3);

    }

}
