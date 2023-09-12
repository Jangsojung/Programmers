package Level1;

public class _17681_SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] map1 = new String[n];
        String[] map2 = new String[n];

        for(int i = 0 ; i < n ; i++) {
            map1[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(" ", "0");
            map2[i] = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(" ", "0");
        }

        for(int i = 0 ; i < n ; i++) {
            StringBuilder sb = new StringBuilder();

            for(int j = 0 ; j < n ; j++) {
                if(map1[i].charAt(j) == '0' && map2[i].charAt(j) == '0') {
                    sb.append(' ');
                } else {
                    sb.append('#');
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }
}
