package Training.Day7;

import java.util.Stack;

public class _181921_MakeArrayFourStack {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stack.isEmpty()) {
                stack.add(arr[i++]);
            } else {
                if (stack.peek() < arr[i]) {
                    stack.add(arr[i++]);
                } else {
                    stack.pop();
                }
            }
        }

        return stack.stream().mapToInt(a -> a).toArray();
    }
}