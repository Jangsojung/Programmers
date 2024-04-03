package Training.Day2;

public class _181943_MixString {
    public String solution(String my_string, String overwrite_string, int s) {
        String str = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > str.length()) {
            str += my_string.substring(str.length());
        }

        return str;
    }
}