package Training.Day2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _181945_PrintEach {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}