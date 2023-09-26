package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _118667_MakeTwoQueuesSumSame {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        long q1Sum = Arrays.stream(queue1).sum();
        long q2Sum = Arrays.stream(queue2).sum();

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i = 0 ; i < queue1.length ; i++) {
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }

        while(q1Sum != q2Sum) {
            if(q1Sum < q2Sum) {
                int element = q2.poll();
                q1.offer(element);
                q1Sum += element;
                q2Sum -= element;
            } else {
                int element = q1.poll();
                q2.offer(element);
                q2Sum += element;
                q1Sum -= element;
            }

            answer++;

            if(answer > 600000) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}