package Training.Day7;

import java.util.ArrayList;

public class _181921_MakeArrayFour {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arrList.isEmpty()) {
                arrList.add(arr[i]);
            } else {
                if (arrList.get(arrList.size() - 1) < arr[i]) {
                    arrList.add(arr[i]);
                } else {
                    arrList.remove(arrList.size() - 1);
                    i--;
                }
            }
        }

        int[] stk = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++) {
            stk[i] = arrList.get(i);
        }

        return stk;
    }
}