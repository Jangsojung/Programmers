package Level2;

import java.util.HashMap;

public class _42578_Clothes {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String[] clothe : clothes) {
            if (hashMap.containsKey(clothe[1])) {
                hashMap.put(clothe[1], hashMap.get(clothe[1]) + 1);
            } else {
                hashMap.put(clothe[1], 1);
            }
        }

        for(String key : hashMap.keySet()) {
            answer *= hashMap.get(key) + 1;
        }

        return answer - 1;
    }
}