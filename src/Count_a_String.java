public class Count_a_String {

    // Program to enter any string and count total number of 'a' in that string

    static int countOccurrence(String b,char ch){
        int count = 0;
        for(int i = 0;i <b.length(); i++){
            if (b.charAt(i) == ch){
                ++count;
            }
        }

        return count;

    }
     //main method
    public static void main(String []args)
    {
        System.out.print(countOccurrence( "PrishaPearl", 'a'));
    }


}
