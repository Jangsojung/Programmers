package Training.Day8;

public class _181914_9Remainder {
    public int solution(String number) {
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - '0';
        }

        return answer % 9;
    }
}