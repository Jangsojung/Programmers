package Training.Day1;

import java.util.Scanner;

public class _181950_repeatPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++) {
            System.out.print(str);
        }
    }
}