package Training.Day11;

public class _181902_CountCharacter {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c <= 'Z') {
                answer[my_string.charAt(i) - 'A']++;
            } else {
                answer[my_string.charAt(i) - 'a' + 26]++;
            }
        }

        return answer;
    }
}