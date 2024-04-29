package Level1;

public class _86491_MinimumRectangle2 {
    public int solution(int[][] sizes) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int[] size : sizes) {
            int big = Math.max(size[0], size[1]);
            int small = Math.min(size[0], size[1]);

            max1 = Math.max(max1, big);
            max2 = Math.max(max2, small);
        }

        return max1 * max2;
    }
}