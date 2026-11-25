public class basicStrings {
    //take char as input, print the char, print ascii value of the input
    
    public static void printchar()
    {
        char temp = 'a';
        System.out.println(temp);
        //return ch;
    }

    public static void printAscii()
    {
        char temp = 65;
        System.out.println(temp);
    }

    public static void printCharIncrement() {
        char ch = 'a';
        System.out.println((char) (ch + 1));

    }

    //upper case to lower case
    public static void printUpperToLower()
    {

        char ch = 'A';
        System.out.println("A");
        System.out.println((char) (ch + 32));
    }
    
    //lower to upper

    //char array ,dont initialize
    public static void printCharArrayWithoutInitialise()
    {
        System.out.println("char without initialization");
        char temp[] = new char[8];
        System.out.println(temp);
    }

    public static void printDefaultValueOfChar()
    {
        char[] temp = new char[5];
        System.out.println(temp);

        char[] temp2 = { 'a', 'b', 'A', 'B' };
        for (int i = 0; i < temp2.length; i++) {
            System.out.println(temp2[i]);
        }
    }

    //create char array initialize abcde print use loops
    public static void printCharUseLoops()
    {
        char temp[] = { 'A', 'B', 'C', 'D', 'E' };
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    }

    //create array of length=2 then print length
    public static void printLengthOfchar()
    {
        char ch[] = { 'a', 'b', 'c' };
        System.out.println(ch.length);

    }

    //demo ascii values stored as characters
    public static void printAsciiToChar()
    {
        char temp[] = { 65, 66, 67, 68, 69 };
        for (int i = 0; i < temp.length; i++) {
            System.out.println((char) (temp[i]));
        }

    }

    public static void demo8()
    {
        char temp[] = new char[5];
        temp[0] = 'A';

    }

    //crete a string findlength and print string
    public static void printString()
    {
        String name = "milan";
        System.out.println(name);

        System.out.println(name.length());
    }

    //char arry even indices
    public static void printEvenIndices()
    {
        System.out.println("for each loop");
        char temp[] = { 'A', 'B' };
        for(char c:temp)
        {
            System.out.println(c);
        }
    }

    //print ascii value of all char present in your name
    public static void printASCIIValueInName()
    {
        char ch[] = { 'M', 'I', 'L', 'A', 'N' };
        System.out.println("print ASCII Value for ur name");
        for(int i=0;i<ch.length;i++)
        {
            System.out.println((int)(ch[i]));
        }
    }

    //print ASCII value of 0 to 9
    static void printASCIIValueForNumbers()
    {
        
        System.out.println("print the ASCII Value for Numbers");
        for(char i='0';i<='9';i++)
        {
            System.out.println((int)i);
        }
    }

    //print middle char of even length input
    static void printMiddleCharOddLength()
    {
        char ch[] = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println("print odd index char");
        for(int i=0;i<ch.length;i++)
        {
            if (i % 2 == 0) {
                System.out.println(ch[i]);
            }
        }
    }
    //prit odd indexed values
    static void printOddChar() {
        String str = "milan";
        System.out.println("printing the odd character");
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.println(str.charAt(i));
            }
        } 
    }
    

    public static void main(String[] args)
    {
        /* char temp = 'a';
        System.out.println(temp);
        
        char[] c   =  { 'a',  'b' , 'c' };
        System.out.println(c.length); */
        
        printchar();

        printAscii();

        printCharIncrement();

        printUpperToLower();

        printDefaultValueOfChar();

        printCharUseLoops();

        printAsciiToChar();

        printCharArrayWithoutInitialise();

        printString();

        printEvenIndices();

        printASCIIValueInName();

        printASCIIValueForNumbers();

        printMiddleCharOddLength();
     
        printOddChar();
        

    }
    
}
