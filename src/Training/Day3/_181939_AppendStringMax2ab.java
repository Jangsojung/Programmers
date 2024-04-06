package Training.Day3;

public class _181939_AppendStringMax2ab {
    public int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);

        return Math.max(ab, 2 * a * b);
    }
}