package Level1;

import java.util.Stack;

public class _12906_DifferentNumberStack {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (st.lastElement() != arr[i]) {
                st.add(arr[i]);
            }
        }

        int[] answer = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            answer[i] = st.get(i);
        }

        return answer;
    }
}