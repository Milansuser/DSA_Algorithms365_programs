package general_java.strings;
import java.util.*;
public class charArray25PracticeQuestions {

    // 1. Count the vowels and consonants. Return both as [vowels, consonants].
    // Input to the function:  ['a','p','p','l','e']
    // Return from the function:  [2, 3]
    public static int[] countVowelsAndConsonants(char character[])
    {
        int vowels=0;
        int consonents=0;
        for(int i=0;i<character.length;i++)
        {
            if(character[i]=='a' || character[i]=='e' || character[i]=='i'
                    || character[i]=='o' || character[i]=='u'
                    || character[i]=='A' || character[i]=='E'
                    || character[i]=='I' || character[i]=='O'
                    || character[i]=='U')
            {
                vowels++;
            }
            else{
                consonents++;
            }

        }
        return new int[]{vowels,consonents};
    }

    //******************************************************************

    // 2. Return how many times a given character appears.
    // Input to the function:  ['b','a','n','a','n','a'] and 'a'
    // Return from the function:  3
    public static int countFrequencyOfOcurrance(char []character2,int singleChar)
    {
        System.out.println();
        int result=0;
        for(int i=0;i<character2.length;i++)
        {
            if(character2[i]==singleChar)
            {
                result++;
            }
        }
        return result;
    }

    //******************************************************************

    // 3. Return the array with every letter in capitals.
    // Input to the function:  ['c','o','d','e']
    // Return from the function:  ['C','O','D','E']
    public static char[] returnIntoCapitalCharacter(char [] character3)
    {
        char []capitalCharacters=new char[character3.length];
        for(int i=0;i<character3.length;i++)
        {
            capitalCharacters[i]=(char)(character3[i]-32);
        }
        return capitalCharacters;

    }

    //******************************************************************

    // 4. Return true if the array contains at least one digit.
    // Input to the function:  ['p','a','s','s','1']
    // Return from the function:  true
    public static boolean containsDigit(char []character4)
    {
        for(int i=0;i<character4.length;i++)
        {
            if(Character.isDigit(character4[i]))
            {
                return true;
            }
        }
        return false;
    }

    //*****************************************************************

    // 5. Return the first and the last character as a new array.
    // Input to the function:  ['m','a','n','g','o']
    // Return from the function:  ['m','o']

    public static char[] returnFirstAndLastCharacter(char [] character5)
    {
        char[] result=new char[2];
        result[0]=character5[0];
        result[1]=character5[character5.length-1];
        return result;
    }

    //*****************************************************************

    // 6. Return how many capital letters are in the array.
    // Input to the function:  ['I','n','d','i','a','N','o','1']
    // Return from the function:  2

    public static int getCapitalLetterCount(char [] character6)
    {
        int result=0;
        for(int i=0;i<character6.length;i++)
        {
            if(character6[i]>='A' && character6[i]<='Z'){
                result++;
            }
        }

        return result;
    }

    //*****************************************************************

    // 7. Password check: return true if the password has at least 8 characters and at least one digit.
    // Input to the function:  ['s','e','c','r','e','t','9','x']
    // Return from the function:  true

    public static boolean ValidPassword(char []character7)
    {
        int sumDigits=0;
        int sumCharacters=0;
        boolean result=false;
        for(int i=0;i<character7.length;i++)
        {
            if(character7[i]>='a' && character7[i]<='z'){
                sumCharacters++;
            }
            else{
                sumDigits++;
            }
        }
        if(sumDigits >=1 && sumCharacters>=8)
        {
            result=true;
        }
        return result;
    }

    //*****************************************************************

    // 8. Return the array with every space replaced by an underscore '_'.
    // Input to the function:  ['h','i',' ','t','h','e','r','e']
    // Return from the function:  ['h','i','_','t','h','e','r','e']

    public static void replaceSpaceByUnderscore(char[] character8) {
        for(int i=0;i<character8.length;i++)
        {
            if(character8[i]==' '){
                character8[i]='_';
            }
        }

        for(int i=0;i<character8.length;i++)
        {
            System.out.print(character8[i]);
        }
        System.out.println();
    }

    //*****************************************************************

    // 11. Return the array with all vowels removed.
    // Input to the function:  ['p','r','o','g','r','a','m']
    // Return from the function:  ['p','r','g','r','m']

    public static void vowelsRemoved(char[] character11)
    {
        for(int i=0;i<character11.length;i++)
        {
            if(character11[i]=='a' ||character11[i]=='e' ||character11[i]=='i'
                    ||character11[i]=='o' ||character11[i]=='u'
                    ||character11[i]=='A'||character11[i]=='E'
                    ||character11[i]=='I' ||character11[i]=='O'
                    ||character11[i]=='U'){
                character11[i]=character11[i+1];
                i++;
            }
        }

        for(int i=0;i<character11.length;i++)
        {
            System.out.println(character11[i]);
        }
    }

    //*****************************************************************

    // 12. Return the letter that comes last in alphabetical order.
    // Input to the function:  ['d','o','g','s']
    // Return from the function:  's'

    public static char getLastLetter(char[] character12)
    {
        char result=' ';
        for(int i=1;i<character12.length;i++)
        {
            if(character12[i]>character12[i-1]){
                result=character12[i];
            }
        }
        return result;

    }

    //*****************************************************************

    // 13. Given the grades of a class, return how many students got 'A'.
    // Input to the function:  ['A','B','A','C','A','B']
    // Return from the function:  3

    public static int getMoreOccuranceOfGivenCharacter(char [] character13)
    {
        int result=0;
        for(int i=0;i<character13.length;i++)
        {
            if(character13[i]=='A' || character13[i]=='a'){
                result++;
            }
        }
        return result;
    }

    //*****************************************************************

    // 14. Return the sum of all the digit characters, ignoring letters.
    // Input to the function:  ['a','3','b','7','2']
    // Return from the function:  12

    public static int getSumOfAllDigits(char[] character14){
        int result=0;
        for(int i=0;i<character14.length;i++)
        {
            if(character14[i]>='0' && character14[i]<='9'){
                result+=character14[i]-'0'; // - 0 is used to get the int digit in char '9'-'0' --> 9 [integer]
            }
        }
        return result;
    }

    //*****************************************************************

    // 15. Given the traffic signal colors seen in a day ('R', 'G', 'Y'), return the counts as [red, green, yellow].
    // Input to the function:  ['R','G','G','Y','R','G']
    // Return from the function:  [2, 3, 1]

    public static int[] sumTrafficSignalColors(char[] character15)
    {
        int red=0;
        int green=0;
        int yello=0;
        for(int i=0;i<character15.length;i++)
        {
            if(character15[i]=='R'){
                red++;
            }
            else if(character15[i]=='G'){
                green++;
            }
            else{
                yello++;
            }
        }
        return new int[]{red, green, yello};
    }

    //*****************************************************************

    /* 16. Mobile number check: return true if there are exactly 10 characters and all are digits.
    Input to the function:  ['9','8','4','5','0','1','2','3','4','5']
    Return from the function:  true */

    public static boolean checkMobileNumber(char [] character16)
    {
        /*if(character16.length==10)
        {
            return true;
        }
        return false;*/

        int totalNumber=0;
        for(int i=0;i<character16.length;i++)
        {
            //System.out.println((int)(character16[i]));
            if((int)(character16[i])>=48){
                totalNumber++;
            }
        }
        if(totalNumber==10){
            return true;
        }
        return false;
    }

    //*****************************************************************

    // 17. Return the array with each letter moved one step forward in the alphabet ('z' becomes 'a').
    // Input to the function:  ['c','a','t','z']
    // Return from the function:  ['d','b','u','a']

    public static int[] eachLetterMovedOneStepForward(char [] character17){
        return new int[]{};
    }

    //*****************************************************************

    // 18. Return the positions (indexes) where a given character appears.
    // Input to the function:  ['h','e','l','l','o'] and 'l'
    // Return from the function:  [2, 3]

    public static int[] returnIndexOfGivenChar(char[] character18 ,char character)
    {
        int count=0;
        int k=0;
        int [] result=new int[k];
        for(int i=0;i<character18.length;i++)
        {
            if(character18[i]==character)
            {
                result[i]=i;
                k++;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        char character1[]={'a','p','p','l','e'};
        int []result1=countVowelsAndConsonants(character1);
        System.out.println(Arrays.toString(result1));
        System.out.println("vowels: "+result1[0]);
        System.out.println("consonents: "+result1[1]);

        char[] character2={'b','a','n','a','n','a'};
        char singleChar='a';
        int result2=countFrequencyOfOcurrance(character2,singleChar);
        System.out.println("The Frequency of the given letter is: "+result2);

        char[] character3={'c','o','d','e'};
        char []result3=returnIntoCapitalCharacter(character3);
        System.out.println(Arrays.toString(result3));

        char[] characters4 = {'p', 'a', 's', 's', '1'};
        boolean result4 = containsDigit(characters4);
        System.out.println(result4); // true

        char[] character5={'m','a','n','g','o'};
        char []result5=returnFirstAndLastCharacter(character5);
        System.out.println(Arrays.toString(result5));

        char[] character6={'I','n','d','i','a','N','o','1'};
        int result6=getCapitalLetterCount(character6);
        System.out.println(result6);//2

        char[] character7={'s','e','c','r','e','t','9','x'};
        //char[] character7={'2','e'};
        System.out.println("result: "+ValidPassword(character7));

        char[] character8={'h','i',' ','t','h','e','r','e'};
        replaceSpaceByUnderscore(character8);

        char[] character11={'p','r','o','g','r','a','m'};
        vowelsRemoved(character11);

        char[] character12={'d','o','g','s'};
        char res=getLastLetter(character12);
        System.out.println("The largest character is: "+res);

        char[] character13={'A','B','A','C','A','B'};
        int result13=getMoreOccuranceOfGivenCharacter(character13);
        System.out.println(result13); //3

        char[] character14={'a','3','b','7','2'};
        int result14=getSumOfAllDigits(character14);
        System.out.println(result14);

        char[] character15={'R','G','G','Y','R','G'};
        int result15[]=sumTrafficSignalColors(character15);
        System.out.println("traffic singnal values: "+result15[0]+" "+result15[1]+" "+result15[2]);

        char[] character16={'9','8','4','5','0','1','2','3','4','8'};
        boolean result16=checkMobileNumber(character16);
        System.out.println(result16); // true.

        /*char[] character17={'c','a','t','z'};
        eachLetterMovedOneStepForward(character17);*/

        char [] character18={'h','e','l','l','o'};
        char character='l';
        int []result18=returnIndexOfGivenChar(character18,character);





    }
}
