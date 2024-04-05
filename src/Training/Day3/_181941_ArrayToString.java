package Training.Day3;

public class _181941_ArrayToString {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();

        for (String c : arr) {
            sb.append(c);
        }

        return sb.toString();
    }
}

//return String.join("", arr);