
public class next_prev_char {

    public static void main(String[] args) {

        char ch = 'X';

        //Next character
        char next = (char) (ch + 1);

        //previous character
        char prev = (char) (ch-1);

        System.out.println("Next of " + ch + " is " + next);

        System.out.println("Prev of " + ch + " is " + prev);
    }
}
