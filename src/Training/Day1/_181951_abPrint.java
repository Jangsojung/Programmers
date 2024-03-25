package Training.Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _181951_abPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        System.out.println("a = " + str[0]);
        System.out.println("b = " + str[1]);
    }
}