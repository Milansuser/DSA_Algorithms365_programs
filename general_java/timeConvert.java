package general_java;
public class timeConvert {
    public static void main(String[] args) {
        int totalSeconds = 3725;

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds = "
                + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
    
}
