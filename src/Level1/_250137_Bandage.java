package Level1;

public class _250137_Bandage {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int hp = health;
        int cri = 0;
        int attackCnt = 0;
        int[] attackTimes = new int[attacks.length];

        for(int i = 0 ; i < attacks.length ; i++) {
            attackTimes[i] = attacks[i][0];
        }

        for(int i = 0 ; i <= attacks[attacks.length - 1][0] ; i++) {
            if(hp <= 0) {
                return -1;
            }

            if(i == attackTimes[attackCnt]) {
                hp -= attacks[attackCnt++][1];
                cri = 0;
            }
            else {
                hp += bandage[1];
                if(hp > health) {
                    hp = health;
                }
                cri++;

                if(cri == bandage[0]) {
                    hp += bandage[2];
                    if(hp > health) {
                        hp = health;
                    }
                    cri = 0;
                }
            }
        }

        if(hp == 0) return -1;
        return hp;
    }
}
