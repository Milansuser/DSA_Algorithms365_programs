package general_java.strings;
// using two pointers--> only traversal is required
// time complexity --> O(n);
// Space complexity --> O(1);
public class isPalLeetCodeA3Optimized
{
    public static void testPalindromeA1(String input)
    {
        boolean answer=isPalindrome(input);
        System.out.println("input : "+input);
        System.out.println("result : "+answer);

    }

    public static boolean isPalindrome(String input)
    {
        input = input.toLowerCase();
        int right=input.length()-1;
        int left=0;
        while(left<right)
        {
            // ignore special chars
            while(left<right && !Character.isLetterOrDigit(input.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(input.charAt(right))){
                right++;
            }

            if(input.charAt(left)!=input.charAt(right)){
                return false;
            }
            //move both
            left++;
            right--;
        }

        return false;

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
