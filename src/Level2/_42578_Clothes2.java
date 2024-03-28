package Level2;

import java.util.HashMap;

public class _42578_Clothes2 {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String kind = clothe[1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }

        for(String kind : map.keySet()) {
            answer *= map.get(kind) + 1;
        }

        return answer - 1;
    }
}