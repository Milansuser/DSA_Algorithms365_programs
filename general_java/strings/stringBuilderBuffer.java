package general_java.strings;

public class stringBuilderBuffer {

    public static void builderAppend()
    {
        StringBuilder str=new StringBuilder("java ");
        str.append("programming");
        System.out.println(str);
    }

    public static void builderInsert()
    {
        StringBuilder str=new StringBuilder("java ");
        str.insert(1,"programming");
        System.out.println(str);
    }

    public static void builderDelete()
    {
        StringBuilder str=new StringBuilder("java ");
        str.delete(1,3);
        System.out.println(str);
    }

    public static void builderReplace()
    {
        StringBuilder str=new StringBuilder("java ");
        str.replace(1,2,"programming");
        System.out.println(str);
    }

    public static void builderReverse()
    {
        StringBuilder str=new StringBuilder("java ");
        str.reverse();
        System.out.println(str);
    }

    public static void builderCapacity()
    {
        StringBuilder str=new StringBuilder("java");
        //str.capacity();
        System.out.println(str.capacity());
    }

    //ensure capacity

    //setCharAt
    public static void builderSetCharAt()
    {
        StringBuilder str=new StringBuilder("java ");
        str.setCharAt(0,'m');
        System.out.println(str);
    }

    //setLength
    public static void builderSetLength()
    {
        StringBuilder str=new StringBuilder("java");
        str.setLength(7);
        System.out.println(str);
    }

    //substring

    //toString

    // string buffer
    // thread safe , synchronized

    public static void bufferDemo()
    {
        StringBuffer str=new StringBuffer("java");
        System.out.println(str.reverse());
    }

    public static void main(String[] args) {
        // append --> adds text to the end
        builderAppend();
        builderInsert();
        builderDelete();
        builderReplace();
        builderReverse();
        builderCapacity();

        builderSetCharAt();
        builderSetLength();

        bufferDemo();


    }
}
