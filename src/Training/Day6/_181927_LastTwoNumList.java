package Training.Day6;

public class _181927_LastTwoNumList {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        //System.arraycopy(num_list, 0, answer, 0, num_list.length);

        int last = num_list[num_list.length - 1];
        int lastBefore = num_list[num_list.length - 2];

        answer[num_list.length] = last > lastBefore ? last - lastBefore : last * 2;

        return answer;
    }
}