package Training.Day9;

import java.util.ArrayList;

public class _181912_MakeArrayFive {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            int i = Integer.parseInt(intStr.substring(s, s + l));
            if (i > k) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}