package Training.Day14;

import java.util.ArrayList;

public class _181885_ToDoList {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                arrayList.add(todo_list[i]);
            }
        }

        String[] answer = new String[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}