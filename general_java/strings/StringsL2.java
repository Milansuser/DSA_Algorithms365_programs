package general_java.strings;

public class StringsL2 {
    //take char array input count vowels
    static int countVowelsInYourName()
    {
        int count = 0;
        char ch[] = { 'm', 'i', 'l', 'a', 'n' };
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
                    || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                count++;
            }
        }
        return count;
    }
    
    // for string
    static int countVowelsFromString()
    {
        String ch = "milan";
        int count = 0;
        for (int i = 0; i < ch.length(); i++) {
            /* if (ch[i].charAt == 'a' || ch[i].charAt == 'e' || ch[i].charAt == 'i' || ch[i].charAt == 'o'
                    || ch[i].charAt == 'u' || ch[i].charAt == 'A'
                    || ch[i].charAt == 'E' || ch[i].charAt == 'I' || ch[i].charAt == 'O' || ch[i].charAt == 'U') {
                count++;
            } */
        }
        return count;
    }
    
    //print uppercase 
    static int printUpperCaseLettersInChar()
    {
        int count = 0;
        char ch[] = { 'A', 'b', 'v', 'C', 'S' };
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                count++;
            }
        }
        return count;
    }
    
    static void printUpperCaseLettersInString()
    {
        String str = "mIlAn";
        /* for(int i=0;i<str.length();i++)
        {
            if(ch[i].charAt)
        } */
    }

    //count digits in a given string
    static int countDigitsInChar()
    {
        char ch[] = { 'a', 1, 'b', 3 };
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 0 && ch[i] <= 9) {
                count++;
            }
        }
        return count;

    }

    static int countDigitsInString()
    {
        int count = 0;
        String str = "mi1la2n3";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 0 && str.charAt(i) <= 9) {
                count++;
            }
        }

        return count;
    }

    static int printSpecialChar()
    {
        String str = "m@l-a;---";
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'
                    || str.charAt(i) >= 0 && str.charAt(i) <= 9) {

                count++;
            }
        }
        return count;
    }

    static boolean searchInChar()
    {
        char ch[] = { 's', 'a', 'h', 'a', 'n', 'a' };
        boolean bool = false;
        char letter = 's';

        for (int i = 0; i < ch.length; i++) {
            if (letter == ch[i]) {
                bool = true;
                break;
            }
        }
        return bool;

    }
    
    static int countTheOcurrancesInWord() {
        int count = 0;
        char ch = 'g';
        char[] temp = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' };
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == ch)
                count++;
        }

        return count;

    }

    //replace vowels with *
    static void replaceVowelsWithStar()
    {
        String str="milan";
        String result="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o'
                    ||str.charAt(i)=='u'|| str.charAt(i)=='A'|| str.charAt(i)=='E' || str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U')
            {
                result+='*';
            }
            else
            {
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
    //replace digits with #
    static void replaceDigitsWithHash()
    {
        String name="mi2l3a4n";
        String result="";
        for(int i=0;i<name.length();i++)
        {

            if(name.charAt(i)>=0 && name.charAt(i)<=9)
            {
                result+='#';
            }
            else {
                result+=name.charAt(i);
            }
        }
        System.out.println(result);
    }

    //find largest char --> BACD --> D
    static void printLargestCharInString()
    {
        String name="bacd";
        for(int i=1;i<name.length();i++)
        {
            if(name.charAt(i)>='a' && name.charAt(i)<='z')
            {
                if(name.charAt(i)>name.charAt(i-1))
                {
                    System.out.println(name.charAt(i));
                }
            }
        }

    }
    //find smallest char --> BACD --> A
    static void printSmallestCharInString()
    {
        String name="bcda";
        for(int i=1;i<name.length();i++)
        {

            if(name.charAt(i)>='a' && name.charAt(i)<='z')
            {
                if(name.charAt(i)<name.charAt(i-1))
                {
                    System.out.println(name.charAt(i));
                }
            }
        }
        System.out.println();
    }

    //check palindrome
    static boolean checkPalindromeInString()
    {
        String name="mam";
        String reverse="";

        boolean result=false;
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse+=name.charAt(i);
        }
        return reverse.equals(name);
    }
    
    //programming count occurances of 'g'

    static void countOcurranceOfLetter()
    {
        String name="programming";
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)=='g') count++;
        }
        System.out.println(count);
    }

    public static int mostWordsFound(String[] sentences) {
        int totalCount=0;
        for(int i=0;i<sentences.length;i++)
        {
            int count=sentences[i].split(" ").length;
            totalCount=Math.max(totalCount,count);

        }
        return totalCount;
    }

    public static void reverseChar_557()
    {
        char[]sentense={'w','e','r','r'};
        int start=0;
        for(int end=0;end<sentense.length;end++)
        {
            if(end>=sentense.length || sentense[end]==' '){
                int left=start;
                int right=end-1;

                while(left<right)
                {
                    char temp=sentense[left];
                    sentense[left]=sentense[right];
                    sentense[right]=temp;

                    left++;
                    right--;
                }
                start=end+1;
            }
        }

        for(char ch:sentense)
        {
            System.out.println(ch);
        }
        System.out.println();

    }

    public static void leetCode2114()
    {
        String[] str={"i love mom","mission impossible"};

        int maxCount=0;
        for(int i=0;i<str.length;i++){
            int word=1;

            for(int j=0 ; j<str[i].length();j++)
            {
                if(str[i].charAt(j)==' '){
                    word++;

                }
            }
            if(word>maxCount){
                maxCount=word;
            }
        }
        System.out.println(maxCount);


    }
    public static void main(String[] args) {
        /* int result = countVowelsInYourName();
        System.out.println(result);

        int result2 = countVowelsFromString();
        System.out.println(result2); */

        /* int result = printUpperCaseLettersInChar();
        System.out.println(result); */

        /* int result = countDigitsInChar();
        System.out.println(result); */

        /* int result = countDigitsInString();
        System.out.println(result); */

        /* int result = printSpecialChar();
        System.out.println(result); */

        /* boolean result = searchInChar();
        System.out.println(result); */
        
        /*int result = countTheOcurrancesInWord();
        System.out.println(result);*/

        //replaceVowelsWithStar();

        //replaceDigitsWithHash();

        //printLargestCharInString();

        //printSmallestCharInString();

        /*boolean res=checkPalindromeInString();
        System.out.println(res);*/

        /*countOcurranceOfLetter();

        String name="this   ";
        String result=name.trim();

        System.out.println(result);
        System.out.println(result.length());
        System.out.println(name.length());*/

        /*String []str={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int count=mostWordsFound(str);
        System.out.println(count);

        System.out.println(str[0].split(" ").length);

        String res="milan is the";
        String[] res1=res.split(" ");
        for(String print:res1)
        {
            System.out.println(print.length());
        }*/

        //reverseChar_557();

        leetCode2114();


        
    }
    
}
