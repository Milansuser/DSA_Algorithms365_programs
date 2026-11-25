package general_java.stringMethods;

public class stringMethodsmain {
    // toCharArray()
    // convert string into array
    //char[] arr=str.toCharArray();
    public static void toCharArray(){
        String name="algorithms";
        char[] result=name.toCharArray();
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }

    //equals() --> compares two strings exact equality
    // actually equals compare the contents not address
    // syntax--> str1.equals(str2) -- str1="java" . str2="java"
    // equals see even case sensitive letters too
    public static void equals()
    {
        String name1="milan";
        String name2="Milan";

        System.out.println(name1.equals(name2));
    }

    //equals ignore case --> case sensitive letters
    //upper case and lower case are treated as equal
    //syntax --> name1.rqualsIgnoreCase(name2)
    public static void equalsIgnoreCase()
    {
        String name1="milan";
        String name2="Milan";

        System.out.println(name1.equalsIgnoreCase(name2));
    }

    //compareTo --> compares strings lexigographically
    // returns 0 if strings are equal
    // <0:first strings comes before second
    // >0: first strings comes before second
    // comparision is based on uniqueCode values
    public static void compareTo() {
        String name1="milan";
        String name2="yashu";
        String name3="lal";

        System.out.println("compare to");
        System.out.println(name1.compareTo(name2));
        System.out.println(name2.compareTo(name3));
        System.out.println(name1.compareTo(name3));

    }

    //comparetoIgnoreCase
    public static void compareToIgnoreCase() {
        String name1="milaN";
        String name2="yashu";
        String name3="lal";

        System.out.println("compare to Ignore case");
        System.out.println(name1.compareToIgnoreCase(name2));
        System.out.println(name2.compareToIgnoreCase(name3));
        System.out.println(name1.compareToIgnoreCase(name3));

    }

    //contains --> checks if the string contains another string
    // return type --> boolean
    // search , check domain name, validation
    static void printContains()
    {
        String name="milan@gmail.com";
        String name2="mil@gmail.com";
        String name3="milan@gmail.com";

        String contain="java c";
        System.out.println(contain.contains("c"));


        System.out.println(name.contains(name2));
        System.out.println(name.contains(name3));

    }

    // removes leading and traling spaces only
    // does not remove the spaces between words
    // return type --> string
    // used --> user input reading file, database values
    static void printTrim()
    {
        String name="        milan           ";

        System.out.println(name.trim().length());
        System.out.println(name.length());
    }

    // split --> breaks the string into places
    // return types --> string array
    // used in CSV files, split name, tokenization
    static void printSplit()
    {
        String name="milan @ gmail";
        String words[]=name.split(" ");

        for(String str:words) //bcos we are traversing in an array
        {
            System.out.println(str);
        }
    }

    //substring begin index --> returns character from begin index till end
    static void printSubStringBeginIndex()
    {
        String name="milan@gmail.com";
        System.out.println(name.substring(5));
    }

    //substring( Begin, End )
    static void printSubStringBeginEnd()
    {
        String name="milan@gmail.com";
        System.out.println(name.substring(0,5));

    }

    //returns first occurrences if found ,if not then returns -1
    // return type --> int;
    // used in --> search , parsing , validation,
    static void printIndexOf(){
        String name="milan@gmail.com";
        System.out.println(name.indexOf("@"));
    }

    //otherIndexOf

    //lastIndexOf --> 4
    static void printLastIndexOf(){
        String name="milan@gmail com";
        System.out.println(name.lastIndexOf(0));
    }

    //valueOf --> any primitive data into string
    //used in concatenation, display, file writing
    static void printValueOf()
    {
        int number = 100;
        String str=String.valueOf(number);
        System.out.println(str);
    }

    //matches
    //is regular expression everything except newline and only single chars
    // dot contains special char, except newline
    static void printMatches()
    {
        //String str="aa";
        //String str="a";
        String str="ab";
        System.out.println(str.matches(".."));
    }

    //regular expression --> matches
    static void printRegEx()
    {
        System.out.println();
        //String name="a";
        String name="xz";
        System.out.println(name.matches("a-z"));
        System.out.println(name.matches("a|b"));
        System.out.println(name.matches("xz"));
        System.out.println(name.matches("[a-z 1-9]"));
        System.out.println(name.matches("[a-z][1-9]"));
        System.out.println(name.matches("[^abc]"));
    }


    static void main(String[] args) {

        /*toCharArray();
        equals();
        equalsIgnoreCase();
        compareTo();
        compareToIgnoreCase();*/
        //printContains();
        printTrim();
        printSplit();
        printSubStringBeginIndex();
        printSubStringBeginEnd();
        printIndexOf();
        printValueOf();
        printMatches();
        printRegEx();
        printLastIndexOf();


    }
}
