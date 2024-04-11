package Training.Day5;

public class _181932_Code {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = false;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
            } else {
                if (!mode && i % 2 == 0) {
                    sb.append(code.charAt(i));
                } else if (mode && i % 2 == 1) {
                    sb.append(code.charAt(i));
                }
            }
        }

        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}