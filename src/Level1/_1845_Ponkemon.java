package Level1;

import java.util.HashSet;
import java.util.Set;

public class _1845_Ponkemon {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        return Math.min(set.size(), nums.length / 2);
    }
}