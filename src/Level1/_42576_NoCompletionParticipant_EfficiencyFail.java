package Level1;

import java.util.Collections;
import java.util.LinkedList;

public class _42576_NoCompletionParticipant_EfficiencyFail {
    public String solution(String[] participant, String[] completion) {
        LinkedList<String> list = new LinkedList<>();

        Collections.addAll(list, participant);

        for (String s : completion) {
            list.remove(s);
        }

        return list.get(0);
    }
}