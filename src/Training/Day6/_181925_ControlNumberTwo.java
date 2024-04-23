package Training.Day6;

public class _181925_ControlNumberTwo {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        int n = numLog[0];
        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - n) {
                case 1:
                    answer.append("w");
                    n = numLog[i];
                    break;
                case -1:
                    answer.append("s");
                    n = numLog[i];
                    break;
                case 10:
                    answer.append("d");
                    n = numLog[i];
                    break;
                case -10:
                    answer.append("a");
                    n = numLog[i];
                    break;
            }
        }

        return answer.toString();
    }
}