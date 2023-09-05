package Level1;

public class _12935_RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;

            //return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++) {
            min = Math.min(min, arr[i]);
        }

        int cnt = 0;
        for(int i = 0 ; i < answer.length ; i++) {
            if(arr[cnt] == min) {
                cnt++;
            }
            answer[i] = arr[cnt++];
        }

        return answer;
    }
}