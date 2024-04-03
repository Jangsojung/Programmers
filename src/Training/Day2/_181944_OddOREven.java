package Training.Day2;

import java.util.Scanner;

public class _181944_OddOREven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? n + " is even" : n + " is odd");
    }
}