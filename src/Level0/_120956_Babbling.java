package Level0;

public class _120956_Babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strs = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (String str : strs) {
                babbling[i] = babbling[i].replaceFirst(str, " ");
            }

            if (babbling[i].trim().length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}