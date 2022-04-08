class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int len = s.length();
        char[] result = new char[len];
        int i = 0;

        int c = 0;
        while (c < len) {
            result[i++] = s.charAt(c);
            c += (numRows - 1) * 2;
        }

        for (int r = 1; r < numRows - 1; r++) {
            int x = 0;
            c = r;
            while (c < len) {
                result[i++] = s.charAt(c);
                c += x == 0 ? ((numRows - r - 1) * 2) : (r * 2);
                x = 1 - x;
            }
        }

        c = numRows - 1;
        while (c < len) {
            result[i++] = s.charAt(c);
            c += (numRows - 1) * 2;
        }

        return String.valueOf(result);
    }
}