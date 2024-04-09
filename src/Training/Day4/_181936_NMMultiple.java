package Training.Day4;

public class _181936_NMMultiple {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}