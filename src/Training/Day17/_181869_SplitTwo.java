package Training.Day17;

import java.util.ArrayList;

public class _181869_SplitTwo {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");

        ArrayList<String> answer = new ArrayList<>();

        for (String s : arr) {
            if (!s.equals("")) {
                answer.add(s);
            }
        }

        return answer.toArray(new String[0]);
    }
}