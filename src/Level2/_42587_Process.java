package Level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class _42587_Process {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : priorities) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (q.peek() == priorities[i]) {
                    q.remove();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}