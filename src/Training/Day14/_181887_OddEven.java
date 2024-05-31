package Training.Day14;

public class _181887_OddEven {
    public int solution(int[] num_list) {
        int oddSum = 0, evenSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }

        return Math.max(oddSum, evenSum);
    }
}