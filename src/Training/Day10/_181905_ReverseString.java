package Training.Day10;

public class _181905_ReverseString {
    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(s, e + 1);

        return my_string.replace(str, reverse(str));
    }

    private String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}