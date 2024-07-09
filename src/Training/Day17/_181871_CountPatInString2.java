package Training.Day17;

public class _181871_CountPatInString2 {
    public int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.substring(i).startsWith(pat)) {
                answer++;
            }
        }

        return answer;
    }
}