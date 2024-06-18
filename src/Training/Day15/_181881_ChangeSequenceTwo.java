package Training.Day15;

import java.util.Arrays;

public class _181881_ChangeSequenceTwo {
    public int solution(int[] arr) {
        int answer = 0;
        int[] before = arr.clone();

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, before)) {
                break;
            }

            answer++;
            before = arr.clone();
        }

        return answer;
    }
}