package Training.Day6;

public class _181926_ControlNumber {
    public int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }

        return n;
    }
}