package Training.Day13;

import java.util.Arrays;

public class _181892_FromN2 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}