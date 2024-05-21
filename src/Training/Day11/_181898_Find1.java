package Training.Day11;

public class _181898_Find1 {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
