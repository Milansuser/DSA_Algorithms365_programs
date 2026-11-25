
package general_java.strings;
import java.util.*;

public class practiseString {
    public static String printAboutStrings()
    {
        String str="milan";
        char []ch=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
            ch[i]+=str.charAt(i);

        }
        System.out.println("this is from the character array");
        System.out.println(ch);

        return "false";
    }

    static void printEachCharInNewLine(String name)
    {
        for(int i=0;i<name.length();i++)
        {
            System.out.println(name.charAt(i));
        }
        System.out.println();
    }

    static void printCountCharInString(String name)
    {
        char[] n =name.toCharArray();

    }

    /*static void printStringArray() {
        String [] sentense={"milan","arjun"};
        int find=0;
        for(int i=1;i< sentense.length;i++)
        {
            if(sentense[i])
        }

    }*/

    static void printStringElements()
    {
        int count=0;
        String str="milaaaann";
        for(int i=1;i<str.length();i++)
        {
            System.out.println(str.charAt(i));

            if(str.charAt(i)==str.charAt(i-1)){
                continue;
            }
            else {
                count++;
            }
        }
        System.out.println(count);

    }

    static void printString()
    {
        String res="";
        String name="milan";
        for(int i=0;i<name.length();i++)
        {
            res+=name.charAt(i)+"t";

        }
        System.out.println(res);
    }

    public static void printBuilderString()
    {
        String ch="milan";

        StringBuilder builder=new StringBuilder(ch);
        System.out.println(builder.reverse());

        char[] cha={'m','i'};

    }
    public static void printHalfString()
    {
        String name="milan";
        for(int i=0;i<name.length()/2;i++)
        {
            System.out.println(name.charAt(i));
        }
    }

    static void main(String[] args) {
        //System.out.println(printAboutStrings());
        String name="milaX33";
        //System.out.println(name.toLowerCase());
        System.out.println("replace");
        //name=name.toLowerCase().matches("[^a-z0-9]");
        System.out.println("replace: "+name);
        System.out.println(name.indexOf(name));
        //printEachCharInNewLine(name);

        /*int[] array={2,9,1,4,7,6,8};
        Arrays.sort(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }*/

        /*System.out.println(name.toCharArray());
        System.out.println(name.substring(0,3));
        System.out.println(name.length());*/

        //printStringArray();
        //printStringElements();

        printBuilderString();
        printHalfString();
    }
}
