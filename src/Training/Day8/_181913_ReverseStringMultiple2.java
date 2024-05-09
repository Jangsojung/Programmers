package Training.Day8;

public class _181913_ReverseStringMultiple2 {
    char[] arr;

    public String solution(String my_string, int[][] queries) {
        arr = my_string.toCharArray();

        for (int[] query : queries) {
            reverse(query[0], query[1]);
        }

        return new String(arr);
    }

    private void reverse(int s, int e) {
        while (s < e) {
            char tmp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = tmp;
        }
    }
}