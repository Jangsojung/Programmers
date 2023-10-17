package PCCP.FirstSampleQuestions;

import java.util.*;

public class _1_121683_TheOddOneOutAlphabet {
    public String solution(String input_string) {
        StringBuilder answer = new StringBuilder();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put(input_string.charAt(0), 0);

        ArrayList<Character> chars = new ArrayList<>();

        for(int i = 1 ; i < input_string.length() ; i++) {
            char c = input_string.charAt(i);

            if(hashMap.containsKey(c)) {
                if(input_string.charAt(i - 1) != c && !chars.contains(c)) {
                    chars.add(c);
                }
            } else {
                hashMap.put(c, 0);
            }
        }

        if(chars.size() == 0) {
            return "N";
        }

        char[] answers = new char[chars.size()];
        for(int i = 0 ; i < chars.size() ; i++) {
            answers[i] = chars.get(i);
        }

        Arrays.sort(answers);

        for(char c : answers) {
            answer.append(c);
        }

        return answer.toString();
    }
}