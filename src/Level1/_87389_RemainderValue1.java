package Level1;

public class _87389_RemainderValue1 {
    public int solution(int n) {
        int answer = 1;

        while (n % answer != 1) {
            answer++;
        }

        return answer;
    }
}
