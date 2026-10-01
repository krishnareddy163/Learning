package ArrayProgramming;

public class ZigzagConversion {

    public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder res = new StringBuilder();
        int increment = 2 * (numRows - 1);

        for (int r = 0; r < numRows; r++) {

            for (int i = r; i < s.length(); i += increment) {
                // vertical element
                res.append(s.charAt(i));

                // diagonal element (for middle rows only)
                if (r > 0 && r < numRows - 1) {
                    int diagIndex = i + increment - 2 * r;
                    if (diagIndex < s.length()) {
                        res.append(s.charAt(diagIndex));
                    }
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}
