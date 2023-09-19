package Level2;

import java.util.Arrays;
import java.util.Collections;

public class _12941_MakeMinimum {
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);

        Integer[] tmpB = Arrays.stream(B).boxed().toArray(Integer[]::new);

        Arrays.sort(tmpB, Collections.reverseOrder());

        int answer = 0;

        for(int i = 0 ; i < A.length ; i++) {
            answer += A[i] * tmpB[i];
        }

        return answer;
    }
}