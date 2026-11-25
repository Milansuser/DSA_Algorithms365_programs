package general_java.stringMethods;

public class homeWorkRegEx {
    public static void validDates()
    {
        String date="31122004";
        System.out.println(date.matches("(\"(0[1-9]|[12][0-9]|3[0-1])/(0[1-9]|1[0-2])/(\\d{4})$\")"));
        // ("(0[1-9]|[12][0-9]|3[0-1])/(0[1-9]|1[0-2])/(\\d{4})$")
    }

    public static void printUserNameFromMailID()
    {
        //String gmail="milan@gmail.com";
        String gmail="milan.s112004@gmail.com";
        int end=gmail.indexOf("@");
        System.out.println("UserName: "+gmail.substring(0,end));

    }

    public static void printDomainNameFromMainID()
    {
        //String domain="milan.s@gmail.com";
        String domain="milan.s@outlook.com";
        //String domain="milan.s@zoho.com";
        //String domain="milan.s@yahoo.com";
        int start=domain.indexOf("@");
        int end=domain.lastIndexOf(".");
        //System.out.println(end);
        System.out.println("DomainName of the Mail: "+domain.substring(start+1,end));
    }

    public static void checkIfTheStringIsBinary()
    {
        String binary="101000111a0";
        System.out.println(binary.matches("[01]+"));

    }

    public static void checkIfTheStringIsHexaDecimal()
    {
        String HexaDecimal="13Ad";
        System.out.println(HexaDecimal.matches("[0-9A-Fa-f]+"));
    }


    public static void main(String[] args) {

        validDates();
        /*printUserNameFromMailID();
        printDomainNameFromMainID();
        checkIfTheStringIsBinary();*/
        //checkIfTheStringIsHexaDecimal();
    }
}
