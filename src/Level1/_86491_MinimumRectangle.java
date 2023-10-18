package Level1;

public class _86491_MinimumRectangle {
    public int solution(int[][] sizes) {
        int ansX = 0;
        int ansY = 0;

        for(int[] size : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);

            ansX = Math.max(ansX, max);
            ansY = Math.max(ansY, min);
        }

        return ansX * ansY;
    }
}