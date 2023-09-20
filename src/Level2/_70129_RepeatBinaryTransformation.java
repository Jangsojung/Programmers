package Level2;

public class _70129_RepeatBinaryTransformation {
    public int[] solution(String s) {
        int ansCnt = 0, ansZero = 0;

        while(!s.equals("1")) {
            int before = s.length();

            s = s.replaceAll("0", "");

            ansZero += before - s.length();

            s = Integer.toBinaryString(s.length());

            ansCnt++;
        }

        return new int[]{ansCnt, ansZero};
    }
}