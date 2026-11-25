package general_java;
public class merging_masking {
    public static void main(String[] args) {

        System.out.println("merging");

        int first = 5;// 00000101
        int second = 10;// 00001010

        int result = (first << 4 | second);
        System.out.println(result);

        System.out.println("merging");

        int number = 90;
        int result1 = number & 15;
        System.out.println(result1);

         
    }
    
}
