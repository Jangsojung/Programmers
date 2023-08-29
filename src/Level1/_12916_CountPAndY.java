package Level1;

public class _12916_CountPAndY {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();

        int pCount = 0, yCount = 0;

        for(int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == 'p') {
                pCount++;
            } else if (s.charAt(i) == 'y') {
                yCount++;
            }
        }

        if(pCount != yCount) {
            answer = false;
        }

        return answer;
    }
}
