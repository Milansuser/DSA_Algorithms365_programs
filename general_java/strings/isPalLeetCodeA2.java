package general_java.strings;


public class isPalLeetCodeA2 {
    public static void testPalindromeA1(String input)
    {
        boolean result=isPalindromeA1(input);
        System.out.println("input : "+input);
        System.out.println("result : "+result);
    }

    public static boolean isPalindromeA1(String input)
    {
        input=input.toLowerCase();
        // use String builder and append

        StringBuilder cleaned= new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char currentchar=input.charAt(i);
            if(Character.isLetterOrDigit(currentchar)){
                cleaned.append(currentchar);
            }
        }

        StringBuilder reverseBuilder=new StringBuilder(cleaned);
        reverseBuilder.reverse();

        //compare both string
        return cleaned.toString().equals(reverseBuilder.toString());
    }
    static void main(String[] args) {
        testPalindromeA1("ayuoefa");
        testPalindromeA1("hellow");
        testPalindromeA1("one sun, one moon, one name");
        testPalindromeA1("madam");
        testPalindromeA1("123321");
        testPalindromeA1("%@^^@%");
    }
}
