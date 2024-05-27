package Training.Day12;

import java.util.ArrayList;

public class _181893_ArraySculpt {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int a : arr) {
            list.add(a);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                list.subList(query[i] + 1, list.size()).clear();
            } else {
                list.subList(0, query[i]).clear();
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}