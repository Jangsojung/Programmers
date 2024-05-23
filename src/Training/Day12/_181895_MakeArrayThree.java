package Training.Day12;

import java.util.ArrayList;

public class _181895_MakeArrayThree {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            list.add(arr[i]);
        }

        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            list.add(arr[i]);
        }

        /*
        for(int[] interval : intervals) {
            for(int i = interval[0] ; i <= interval[1] ; i++) {
                list.add(arr[i]);
            }
        }
        */

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}