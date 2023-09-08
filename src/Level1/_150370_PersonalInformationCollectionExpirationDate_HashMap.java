package Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _150370_PersonalInformationCollectionExpirationDate_HashMap {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> arr = new ArrayList<>();

        HashMap<String, Integer> termMap = new HashMap<>();
        for(int i = 0 ; i < terms.length ; i++) {
            termMap.put(terms[i].split(" ")[0], Integer.parseInt(terms[i].split(" ")[1]));
        }

        StringTokenizer st = new StringTokenizer(today, ".");
        int todayYear = Integer.parseInt(st.nextToken());
        int todayMonth = Integer.parseInt(st.nextToken());
        int todayDay = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < privacies.length ; i++) {
            String pDay = privacies[i].split(" ")[0];

            StringTokenizer st2 = new StringTokenizer(pDay, ".");
            int pDayYear = Integer.parseInt(st2.nextToken());
            int pDayMonth = Integer.parseInt(st2.nextToken());
            int pDayDay = Integer.parseInt(st2.nextToken());

            String pKind = privacies[i].split(" ")[1];

            pDayMonth += termMap.get(pKind);

            if(pDayMonth > 12) {
                pDayYear += pDayMonth / 12;
                if(pDayMonth % 12 != 0) {
                    pDayMonth = pDayMonth % 12;
                } else {
                    pDayYear--;
                    pDayMonth = 12;
                }
            }

            System.out.println(pDayYear + "." + pDayMonth + "." + pDayDay);

            if (pDayYear < todayYear) {
                arr.add(i + 1);
            } else if (pDayMonth < todayMonth && pDayYear == todayYear) {
                arr.add(i + 1);
            } else if (pDayDay <= todayDay && pDayMonth == todayMonth && pDayYear == todayYear) {
                arr.add(i + 1);
            }
        }

        int[] answer = new int [arr.size()];
        for(int i = 0 ; i < arr.size() ; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}