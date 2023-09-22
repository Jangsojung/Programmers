package Level2;

import java.util.Stack;

public class _12973_RemovePairing {
    public int solution(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()) {
            if(!st.isEmpty()) {
                if(st.peek() == c) {
                    st.pop();
                } else {
                    st.push(c);
                }
            } else {
                st.push(c);
            }
        }

        return st.size() > 0 ? 0 : 1;
    }
}