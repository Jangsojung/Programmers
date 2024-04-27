package Training.Day7;

import java.util.ArrayList;

public class _181921_MakeArrayTwo {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            boolean chk = true;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != '0' && str.charAt(j) != '5') {
                    chk = false;
                    break;
                }
            }

            if (chk) {
                arrayList.add(i);
            }
        }

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return arrayList.size() == 0 ? new int[]{-1} : answer;
    }
}