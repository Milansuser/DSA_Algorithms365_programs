package general_java;

public class jvm_arch {

    public static void main(String[] args) {

        int x = 15; // in stack
        int y = 25; // // in stack

        int z = x + y; // in stack

        
        String str = new String("Sum" + z); // heap sum40

        System.err.println(str + z);//sum4040
    }

}
