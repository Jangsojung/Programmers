package Training.Day5;

public class _181931_ArithmeticSequenceBooleanFor {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (d * i);
            }
        }

        return answer;
    }
}