package Training.Day11;

import java.util.ArrayList;

public class _181901_MakeArray {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = k; i <= n; i += k) {
            arr.add(i);
        }

        int[] answer = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}