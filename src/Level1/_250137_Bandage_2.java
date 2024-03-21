package Level1;

public class _250137_Bandage_2 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int cnt = bandage[0];
        int hp = health;
        int lastAttackTime = 0;

        int nonAttackTime, bonusTime;
        for(int[] attack : attacks) {
            if(hp <= 0) {
                return -1;
            }

            nonAttackTime = attack[0] - lastAttackTime - 1;
            bonusTime = nonAttackTime / cnt;

            lastAttackTime = attack[0];

            hp = Math.min(health, hp + nonAttackTime * bandage[1]);
            hp = Math.min(health, hp + bonusTime * bandage[2]);

            hp -= attack[1];
        }

        return hp <= 0 ? -1 : hp;
    }
}