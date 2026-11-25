package general_java;
// how jvm behave with stat , instance and local variable
public class stat {
    //static int a; outputs zero 

    int b;

    public static void main(String [] args)
    {
        //System.out.println(a);

        // value is not provided
        //int a;
        //System.out.println(a);

        stat obj = new stat();
        System.out.println(obj.b);


    }

    
}
