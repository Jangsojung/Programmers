package Level2;

import java.util.HashMap;

public class _12981_EnglishWordChainHashMap {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(words[0], 0);

        for(int i = 1 ; i < words.length ; i++) {
            hashMap.put(words[i], 0);

            if(words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0) || hashMap.size() < i + 1) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;

                break;
            }
        }

        return answer;
    }
}