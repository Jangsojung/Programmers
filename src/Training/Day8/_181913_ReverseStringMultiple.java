package Training.Day8;

import java.util.Stack;

public class _181913_ReverseStringMultiple {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            sb.append(c);
        }

        for (int[] query : queries) {
            Stack<Character> stack = new Stack<>();

            for (int j = query[0]; j <= query[1]; j++) {
                stack.push(sb.charAt(j));
            }

            StringBuilder replaceSb = new StringBuilder();

            while (!stack.isEmpty()) {
                replaceSb.append(stack.pop());
            }

            sb.replace(query[0], query[1] + 1, replaceSb.toString());
        }

        return sb.toString();
    }
}