package Level2;

import java.util.ArrayList;
import java.util.Stack;

public class _42586_FunctionalDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] period = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            int p = 100 - progresses[i];
            if (p % speeds[i] == 0) {
                period[i] = p / speeds[i];
            } else {
                period[i] = p / speeds[i] + 1;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int j : period) {
            if (!st.isEmpty() && st.get(0) < j) {
                list.add(st.size());
                while (!st.isEmpty()) {
                    st.pop();
                }
            }
            st.push(j);
        }

        if (!st.isEmpty()) {
            list.add(st.size());
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}