import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        int step = 1;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            curRow += step;

            if (curRow == numRows - 1 || curRow == 0) {
                step = -step;
            }
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}