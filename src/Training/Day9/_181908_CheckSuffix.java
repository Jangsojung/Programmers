package Training.Day9;

import java.util.Arrays;

public class _181908_CheckSuffix {
    public int solution(String my_string, String is_suffix) {
        boolean check = false;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(i).equals(is_suffix)) {
                check = true;
                break;
            }
        }

        return check ? 1 : 0;
        //return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}