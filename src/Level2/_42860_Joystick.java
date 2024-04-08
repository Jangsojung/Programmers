package Level2;

public class _42860_Joystick {
    public int solution(String name) {
        int answer = 0;
        int cntA;
        int move = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            cntA = i + 1;
            while (cntA < name.length() && name.charAt(cntA) == 'A') {
                cntA++;
            }

            move = Math.min(move, i * 2 + name.length() - cntA);
            move = Math.min(move, (name.length() - cntA) * 2 + i);
        }

        return answer + move;
    }
}