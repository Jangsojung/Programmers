package Training.Day14;

import java.util.ArrayList;

public class _181886_5People {
    public String[] solution(String[] names) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            arrayList.add(names[i]);
        }

        String[] answer = new String[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}