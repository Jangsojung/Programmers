package Training.Day5;

public class _181929_MultiplicationAndSum {
    public int solution(int[] num_list) {
        int multiplication = 1;
        int sum = 0;

        for (int n : num_list) {
            multiplication *= n;
            sum += n;
        }

        return multiplication < Math.pow(sum, 2) ? 1 : 0;
    }
}