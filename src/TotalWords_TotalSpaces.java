public class TotalWords_TotalSpaces {

    //Program to enter any string and count how many total number of words and total spaces in that sentence
    // main method
    public static void main (String[]args){
        int word = 1;
        //total number of words and spaces to be counted
        String str = "Java is platform independent";
        for(int i=0; i<str.length() ; ++i){
            if(str.charAt(i) ==' ')
                word++;

        }
     System.out.println("Number of words =" +word);
     System.out.println("Number of spaces=" +(word-1));


    }


}
