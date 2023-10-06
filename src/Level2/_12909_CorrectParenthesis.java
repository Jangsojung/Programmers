package Level2;

import java.util.Stack;

public class _12909_CorrectParenthesis {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();

        if(s.charAt(0) == ')') {
            return false;
        }

        st.push(s.charAt(0));

        for(int i = 1 ; i < s.length() ; i++) {
            if(s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else {
                if(st.isEmpty()) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }

        return st.isEmpty();
    }
}