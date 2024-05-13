package Training.Day9;

public class _181911_MakeStringToPaste {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0 ; i < parts.length ; i++) {
            answer.append(my_strings[i], parts[i][0], parts[i][1] + 1);
        }

        return answer.toString();
    }
}