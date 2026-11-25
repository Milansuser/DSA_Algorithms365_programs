package general_java.strings;

public class isPalLeetCodeA1
{
    // Leetcode 125 // vaid palindrome
    // Approach :1
    // time complexity : O(n);
    // Space Complexity : O(n);

    public static void testPalindromeA1(String input)
    {
        boolean result=isPalindromeA1(input);
        System.out.println("input : "+input);
        System.out.println("result : "+result);
    }

    public static boolean isPalindromeA1(String input)
    {
        input=input.toLowerCase();

        String cleaned="";
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                cleaned=cleaned+ch;
            }
        }

        //Reverse
        StringBuilder builder=new StringBuilder(cleaned);
        String reversed=builder.reverse().toString();

        return cleaned.equals(reversed);

    }

    public static void main(String[] args) {
        testPalindromeA1("ayuoefa");
        testPalindromeA1("hellow");
        testPalindromeA1("one sun, one moon, one name");
        testPalindromeA1("madam");
        testPalindromeA1("123321");
        testPalindromeA1("%@^^@%");

    }



}
