package Training.Day11;

public class _181900_RemoveCharacter {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        String[] arr = my_string.split("");

        for (int i : indices) {
            arr[i] = "";
        }

        for (String s : arr) {
            answer.append(s);
        }

        return answer.toString();
    }
}