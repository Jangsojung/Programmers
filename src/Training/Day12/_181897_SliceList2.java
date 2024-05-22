package Training.Day12;

import java.util.ArrayList;

public class _181897_SliceList2 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int interval = n == 4 ? slicer[2] : 1;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = start; i <= end; i += interval) {
            arr.add(num_list[i]);
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}