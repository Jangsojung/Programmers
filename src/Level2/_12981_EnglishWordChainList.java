package Level2;

import java.util.ArrayList;
import java.util.List;

public class _12981_EnglishWordChainList {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for(int i = 1 ; i < words.length ; i++) {
            if(!list.contains(words[i])) {
                String beforeWord = list.get(i - 1);
                if(beforeWord.charAt(beforeWord.length() - 1) != words[i].charAt(0)) {
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;

                    break;
                }

                list.add(words[i]);
            } else {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;

                break;
            }
        }

        return answer;
    }
}