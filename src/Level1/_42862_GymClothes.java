package Level1;

public class _42862_GymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = 1;
        }

        for (int i : lost) {
            list[i - 1]--;
        }


        for (int i : reserve) {
            list[i - 1]++;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                if (i != 0 && i != n - 1) {
                    if (list[i - 1] == 2) {
                        list[i - 1]--;
                        list[i]++;
                    } else if (list[i + 1] == 2) {
                        list[i + 1]--;
                        list[i]++;
                    }
                } else {
                    if (i == 0) {
                        if (list[i + 1] == 2) {
                            list[i + 1]--;
                            list[i]++;
                        }
                    } else {
                        if (list[i - 1] == 2) {
                            list[i - 1]--;
                            list[i]++;
                        }
                    }
                }
            }
        }

        for (int j : list) {
            if (j >= 1) {
                answer++;
            }
        }

        return answer;
    }
}
