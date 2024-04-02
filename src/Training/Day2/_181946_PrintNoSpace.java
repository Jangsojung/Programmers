package Training.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _181946_PrintNoSpace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().replaceAll("\\s", ""));
    }
}