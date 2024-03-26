package Level1;

import java.util.*;

public class _92334_Report {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashSet<String> hs = new HashSet<>();
        Collections.addAll(hs, report);

        Map<String, ArrayList<String>> maps = new HashMap<>();
        for(String s : hs) {
            String from = s.split(" ")[0];
            String to = s.split(" ")[1];

            ArrayList<String> arrayList = maps.getOrDefault(to, null);
            if(arrayList == null) {
                arrayList = new ArrayList<>();
            }

            arrayList.add(from);
            maps.put(to, arrayList);
        }

        Map<String, Integer> cntMap = new HashMap<>();
        for(ArrayList<String> arr : maps.values()) {
            if(arr.size() >= k) {
                for(String from : arr) {
                    cntMap.put(from, cntMap.getOrDefault(from, 0) + 1);
                }
            }
        }

        for(int i = 0 ; i < id_list.length ; i++) {
            answer[i] = cntMap.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}