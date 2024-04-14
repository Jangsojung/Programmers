package Level1;

import java.util.Arrays;

public class _42748_ArrayCommands {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerCnt = 0;

        for (int[] command : commands) {
            int[] arr = new int[command[1] - command[0] + 1];
            int arrCnt = 0;
            for (int j = command[0] - 1; j <= command[1] - 1; j++) {
                arr[arrCnt++] = array[j];
            }

            Arrays.sort(arr);

            answer[answerCnt++] = arr[command[2] - 1];
        }

        return answer;
    }
}