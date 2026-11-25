package general_java.strings;
// Decode compressed STring
// input: a3b2c4
// output: aaabbcccc
//use: STring Builder + Parsing
// time
// space
public class decodeCompressedString {

    static void main(String[] args) {
        testDecode("a3b2c4");
        testDecode("x1yz");
        testDecode("a3b2c4");

    }

    public static void testDecode(String input)
    {
        System.out.println("input : "+input);
        System.out.println("result : "+decode(input));

    }

    public static String decode(String input)
    {
        StringBuilder answer=new StringBuilder();
        for(int i=0;i<input.length();i+=2)
        {
            char currentchar=input.charAt(i); //a
            //int number
            int number =input.charAt(i+1)-'0'; // -'0' --> parsing convert one formate to another

            for(int count=1;count<=number;count++)
            {
                answer.append(currentchar);
            }
        }
        return answer.toString();

    }
}
