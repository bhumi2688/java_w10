import java.util.ArrayList;

public class Clone_Arraylist {

    // program to clone an array list to another array list

    //main method
    public static void main (String[]args){

        //creat first arraylist object
        ArrayList<String> cl= new ArrayList<String>();
        //add elements to arraylist
        cl.add("C#");
        cl.add("Java");
        cl.add("Python");
        cl.add("Ruby");
        cl.add("Perl");
        cl.add("PHP");
        System.out.println("Original array list: " +cl);

        ArrayList<String> newcl = (ArrayList<String>)cl.clone();
        //it will clone another array list
        System.out.println("Cloned array list: " + newcl);



    }

}
