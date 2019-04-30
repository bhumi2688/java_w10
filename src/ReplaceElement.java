import java.util.ArrayList;

public class ReplaceElement {

    //Program to replace a particular element in an arraylist with the given element
    //main method
    public static void main (String[]args) {
        //create object
        ArrayList<String> colours = new ArrayList<String>();
        //create colour list
        colours.add("Pink");
        colours.add("Green");
        colours.add("Blue");
        colours.add("White");
        colours.add("Yellow");

        //now to replace Yellow with Purple
        System.out.println("arrayList before replace: " + colours);
        colours.set(2, "Purple"); // index no 2 where we need to replace

        System.out.println("ArrayList after replace " + colours);
    }


}
