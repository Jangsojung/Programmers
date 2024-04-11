package Training.Day5;

public class _181932_Code2 {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                sb.append(code.charAt(i));
            }
        }

        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}