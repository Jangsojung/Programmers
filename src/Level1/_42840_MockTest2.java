package Level1;

import java.util.ArrayList;

public class _42840_MockTest2 {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arrList = new ArrayList<>();

        int[] p1 = new int[]{1, 2, 3, 4, 5};
        int[] p2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) {
                cnt1++;
            }
            if (answers[i] == p2[i % p2.length]) {
                cnt2++;
            }
            if (answers[i] == p3[i % p3.length]) {
                cnt3++;
            }
        }

        int max = Math.max(cnt1, Math.max(cnt2, cnt3));

        if (max == cnt1) {
            arrList.add(1);
        }
        if (max == cnt2) {
            arrList.add(2);
        }
        if (max == cnt3) {
            arrList.add(3);
        }

        int[] answer = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}