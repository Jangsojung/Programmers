package Training.Day3;

public class _181940_StringRepeatK {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}

//return my_string.repeat(k);