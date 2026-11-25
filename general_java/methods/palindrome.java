package general_java.methods;

public class palindrome {

    public static void palindron(int num, int original, int reverse) {
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println("number is an palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
                
    }
    

    public static void main(String[] args) {

        int num = 1221;
        int original = num;
        int reverse = 0;

        palindron(num, original, reverse);
    }
}


