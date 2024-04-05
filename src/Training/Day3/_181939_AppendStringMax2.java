package Training.Day3;

public class _181939_AppendStringMax2 {
    public int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);

        return Math.max(ab, ba);
    }
}