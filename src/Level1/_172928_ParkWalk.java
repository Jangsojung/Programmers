package Level1;

public class _172928_ParkWalk {
    public int[] solution(String[] park, String[] routes) {
        String[][] parkArr = new String[park.length][park[0].length()];
        int[] answer = {0, 0};

        for(int i = 0 ; i < park.length ; i++) {
            for(int j = 0 ; j < park[i].length() ; j++) {
                if(String.valueOf(park[i].charAt(j)).equals("S")) {
                    answer = new int[]{i, j};
                }
                parkArr[i][j] = String.valueOf(park[i].charAt(j));
            }
        }

        for (String route : routes) {
            String op = route.split(" ")[0];
            int n = Integer.parseInt(route.split(" ")[1]);

            switch (op) {
                case "N":
                    if (answer[0] - n >= 0) {
                        for (int j = 1; j <= n; j++) {
                            if (parkArr[answer[0] - j][answer[1]].equals("X")) {
                                break;
                            }
                            if (j == n) {
                                answer[0] -= n;
                            }
                        }
                    }
                    break;
                case "S":
                    if (answer[0] + n < park.length) {
                        for (int j = 1; j <= n; j++) {
                            if (parkArr[answer[0] + j][answer[1]].equals("X")) {
                                break;
                            }
                            if (j == n) {
                                answer[0] += n;
                            }
                        }
                    }
                    break;
                case "W":
                    if (answer[1] - n >= 0) {
                        for (int j = 1; j <= n; j++) {
                            if (parkArr[answer[0]][answer[1] - j].equals("X")) {
                                break;
                            }
                            if (j == n) {
                                answer[1] -= n;
                            }
                        }
                    }
                    break;
                case "E":
                    if (answer[1] + n < park[0].length()) {
                        for (int j = 1; j <= n; j++) {
                            if (parkArr[answer[0]][answer[1] + j].equals("X")) {
                                break;
                            }
                            if (j == n) {
                                answer[1] += n;
                            }
                        }
                    }
                    break;
            }
        }

        return answer;
    }
}