package Level2;

import java.util.HashSet;
import java.util.Set;

public class _131701_NumOfConsecutivePartialSequenceSums {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for(int i = 1 ; i <= elements.length ; i++) {
            for(int j = 0 ; j < elements.length ; j++) {
                int sum = 0;

                for(int m = 0 ; m < i ; m++) {
                    if( j + m > elements.length - 1) {
                        sum += elements[j + m - elements.length];
                    } else {
                        sum += elements[j + m];
                    }
                }

                set.add(sum);
            }
        }

        return set.size();
    }
}