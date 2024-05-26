package Training.Day12;

public class _181894_DomainOfTwo {
    public int[] solution(int[] arr) {
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    start = i;
                } else {
                    end = i;
                }
            }
        }

        if (start != -1) {
            if (end == -1) {
                end = start;
            }

            int size = end - start + 1;

            int[] answer = new int[size];

            for (int i = 0; i < size; i++) {
                answer[i] = arr[start++];
            }

            return answer;
        }

        return new int[]{-1};
    }
}