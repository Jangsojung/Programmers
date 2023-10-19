package Level1;

import java.util.LinkedList;

public class _42840_MockTest {
    public int[] solution(int[] answers) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        int[] person1 = new int[]{1, 2, 3, 4, 5};
        int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int p1Ans = 0, p2Ans = 0 , p3Ans = 0;

        for(int i = 0 ; i < answers.length ; i++) {
            if(answers[i] == person1[i % person1.length]) {
                p1Ans++;
            }
            if(answers[i] == person2[i % person2.length]) {
                p2Ans++;
            }
            if(answers[i] == person3[i % person3.length]) {
                p3Ans++;
            }
        }

        int max = Math.max(p1Ans, Math.max(p2Ans, p3Ans));

        if(max == p1Ans) {
            linkedList.add(1);
        }
        if(max == p2Ans) {
            linkedList.add(2);
        }
        if(max == p3Ans) {
            linkedList.add(3);
        }

        int[] answer = new int[linkedList.size()];
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = linkedList.get(i);
        }

        return answer;
    }
}