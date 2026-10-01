package ArrayProgramming;

public class ExcelColumnNames {

    public static void main(String[] args) {
        int n = 100; // print first 100 values

        for (int i = 1; i <= n; i++) {
            System.out.print(getColumnName(i) + " ");
        }
    }

    private static String getColumnName(int number) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            char ch = (char) ('A' + (number % 26));
            result.insert(0, ch);
            number = number / 26;
        }

        return result.toString();
    }
}
