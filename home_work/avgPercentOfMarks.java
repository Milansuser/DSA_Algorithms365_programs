public class avgPercentOfMarks {
    public static void main(String[] args) {
        int m1 = 78, m2 = 85, m3 = 69, m4 = 92, m5 = 74, m6 = 88;

        int total = m1 + m2 + m3 + m4 + m5 + m6;
        double average = total / 6.0;
        double percentage = (total / 600.0) * 100;

        System.out.println("Total marks : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Percentage  : " + percentage + "%");
    }
}
