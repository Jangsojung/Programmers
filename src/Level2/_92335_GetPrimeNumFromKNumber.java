package Level2;

public class _92335_GetPrimeNumFromKNumber {
    public int solution(int n, int k) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            if(n % k < 10) {
                sb.append(n % k);
            } else {
                sb.append((char)(n % k - 10 + 'A'));
            }

            n /= k;
        }

        String str = String.valueOf(sb.reverse());

        String[] nums = str.split("0");

        for(int i = 0 ; i < nums.length ; i++) {
            if(!nums[i].equals("1") && !nums[i].isEmpty()) {
                long num = Long.parseLong(nums[i]);
                if(isPrime(num)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    private boolean isPrime (long num) {
        for(int i = 2 ; i <= Math.sqrt(num) ; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
