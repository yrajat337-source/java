import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }

        int[][] sorted = intervals.clone();
        Arrays.sort(sorted, (first, second) -> Integer.compare(first[0], second[0]));
        List<int[]> merged = new ArrayList<>();
        int start = sorted[0][0];
        int end = sorted[0][1];

        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i][0] <= end) {
                end = Math.max(end, sorted[i][1]);
            } else {
                merged.add(new int[] {start, end});
                start = sorted[i][0];
                end = sorted[i][1];
            }
        }
        merged.add(new int[] {start, end});

        return merged.toArray(new int[merged.size()][]);
    }
}
