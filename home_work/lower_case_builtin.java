public class lower_case_builtin {
    public static void main(String[] args) {

        //using tolowercase method
        char upper = 'Y';
        char lower = Character.toLowerCase(upper);

        System.out.println(upper + " -> " + lower);
        
        //using conditional method
        char ch = 'G';

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        System.out.println("Lowercase: " + ch);
    }    
}
