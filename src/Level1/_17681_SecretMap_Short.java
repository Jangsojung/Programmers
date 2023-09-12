package Level1;

public class _17681_SecretMap_Short {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0 ; i < n ; i++) {
            answer[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]).replace(" ", "0"));
        }

        for(int i = 0 ; i < n ; i++) {
            answer[i] = answer[i].replace("0", " ");
            answer[i] = answer[i].replace("1", "#");
        }

        return answer;
    }
}