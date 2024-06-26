package Level1;

import java.util.Arrays;

public class _42748_ArrayCommands2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arr);

            answer[i] = arr[commands[i][2] - 1];
        }

        return answer;
    }
}