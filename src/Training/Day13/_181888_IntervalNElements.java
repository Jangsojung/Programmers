package Training.Day13;

import java.util.ArrayList;

public class _181888_IntervalNElements {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            arrayList.add(num_list[i]);
        }

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}