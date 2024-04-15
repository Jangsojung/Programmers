package Level2;

import java.util.Arrays;

public class _42747_HIndex2 {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0; i--) {
            int min = Math.min(citations[i], citations.length - i);

            if (answer < min) answer = min;
            else break;
        }

        return answer;
    }
}