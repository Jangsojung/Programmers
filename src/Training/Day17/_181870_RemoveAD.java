package Training.Day17;

import java.util.ArrayList;

public class _181870_RemoveAD {
    public String[] solution(String[] strArr) {
        ArrayList<String> arr = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                arr.add(s);
            }
        }

        String[] answer = new String[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}