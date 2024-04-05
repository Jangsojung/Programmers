package Training.Day3;

public class _181939_AppendStringMax {
    public int solution(int a, int b) {
        StringBuilder ab = new StringBuilder();
        StringBuilder ba = new StringBuilder();

        int AB = Integer.parseInt(ab.append(a).append(b).toString());
        int BA = Integer.parseInt(ba.append(b).append(a).toString());

        return Math.max(AB, BA);
    }
}