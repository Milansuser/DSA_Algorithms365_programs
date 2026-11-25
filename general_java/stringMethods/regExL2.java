package general_java.stringMethods;

public class regExL2 {
    public static void checkDigit()
    {
        String str="8";
        System.out.println(str.matches("\\d"));
        System.out.println("A".matches("\\d"));
    }

    //2) \w -- matches one word character
    // equal to -- a-z 0-9 A-Z and underscore
    public static void checkWord()
    {
        System.out.println();
        System.out.println("A".matches("\\w"));
        System.out.println("9".matches("\\w"));
        System.out.println("%".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println(" ".matches("\\w"));
    }

    // \D matches anything except digit
    public static void checkNonDigits()
    {
        System.out.println();
        System.out.println("A".matches("\\D"));
        System.out.println("9".matches("\\D"));
        System.out.println("%".matches("\\D"));
        System.out.println("_".matches("\\D"));
        System.out.println(" ".matches("\\D"));
    }

    public static void checkSpace()
    {
        System.out.println();
        System.out.println(" ".matches("\\s"));
        System.out.println("9".matches("\\s"));
        System.out.println("%".matches("\\s"));
        System.out.println("_".matches("\\s"));
        System.out.println(" ".matches("\\s"));

    }
    public static void checkNonSpace()
    {
        System.out.println();
        System.out.println(" ".matches("\\S"));
        System.out.println("9".matches("\\S"));
        System.out.println("%".matches("\\S"));
        System.out.println("_".matches("\\S"));
        System.out.println(" ".matches("\\S"));
    }

    public static void checkNonWord()
    {
        System.out.println();
        System.out.println(" ".matches("\\W"));
        System.out.println("9".matches("\\W"));
        System.out.println("%".matches("\\W"));
        System.out.println("_".matches("\\W"));
        System.out.println(" ".matches("\\W"));
    }

    // Quantifiers

    // zero or more
    public static void starQuant()
    {
        System.out.println();
        String s1="dsfgsy";
        String s2="";
        String s3="11111";
        System.out.println(s1.matches("[abc]*"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
    }

    // + one or more
    public static void plusQuant(){
        System.out.println();
        String s1="dsfgsy";
        String s2="";
        String s3="11111";
        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
    }

    public static void exactCount()
    {
        System.out.println();
        String s1="dsfgsy";
        String s2="";
        String s3="11111";
        String s4="abc";
        System.out.println(s1.matches("[abc]{3}"));
        System.out.println(s2.matches("[abc]{3}"));
        System.out.println(s3.matches("[abc]{3}"));
        System.out.println(s4.matches("[abc]{3}"));
    }

    public static void checkRange()
    {
        System.out.println();
        String s1="abbc";
        String s2="";
        String s3="11111";
        String s4="abc";
        System.out.println(s1.matches("[abc]{1,7}"));
        System.out.println(s2.matches("[abc]{1,2}"));
        System.out.println(s3.matches("[abc]{1,2}"));
        System.out.println(s4.matches("[abc]{1,5}"));
    }

    // ? --> 0 or 1
    public static void question()
    {
        System.out.println();
        System.out.println("Question Mark quant");
        String str1 = "a";
        String str2 = "abc";
        String str3 = "abbc";

        System.out.println(str1.matches("[a?]"));
        System.out.println(str2.matches("[ab?c]"));
        System.out.println(str3.matches("[ab?c]"));

        System.out.println();
    }


    static void main(String[] args) {
        checkDigit();
        checkWord();
        checkNonDigits();
        checkSpace();
        checkNonSpace();
        checkNonWord();

        starQuant();
        plusQuant();
        exactCount();
        checkRange();
        question();
    }
}
