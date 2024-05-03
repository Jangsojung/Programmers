package Training.Day7;

import java.util.ArrayList;

public class _181919_CollatzSequence {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            arrayList.add(n);
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}