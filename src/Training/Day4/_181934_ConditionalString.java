package Training.Day4;

public class _181934_ConditionalString {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                return n >= m ? 1 : 0;
            }
            return n > m ? 1 : 0;
        } else {
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            }
            return n < m ? 1 : 0;
        }
    }
}