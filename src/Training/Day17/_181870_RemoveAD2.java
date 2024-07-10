package Training.Day17;

import java.util.ArrayList;

public class _181870_RemoveAD2 {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                answer.add(s);
            }
        }

        return answer.toArray(new String[0]);
        //return answer.toArray(String[]::new);
    }
}