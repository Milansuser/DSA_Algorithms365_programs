package general_java.methods;

public class count_numbers {

    public static void check(int num, int count) {
        while (num != 0) {
            num = num / 10;
            count++;

        }
        System.out.println("digits:" + count);
        
    }

    public static void main(String[] args) {
        int num=1263;
        int count=0;

        check(num, count);

        
    }
    
}
