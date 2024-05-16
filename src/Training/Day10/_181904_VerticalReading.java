package Training.Day10;

public class _181904_VerticalReading {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length() / m; i++) {
            char w = my_string.charAt(i * m + (c - 1));
            System.out.println(w);
            sb.append(w);
        }

        return sb.toString();
    }
}