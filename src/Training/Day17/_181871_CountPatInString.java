package Training.Day17;

public class _181871_CountPatInString {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patL = pat.length();

        for (int i = 0; i <= myString.length() - patL; i++) {
            for (int j = i + patL; j <= myString.length(); j++) {
                if (myString.substring(i, j).equals(pat)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}