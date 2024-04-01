package Training.Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _181949_ConvertCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) < 'a') {
                sb.append(str.toLowerCase().charAt(i));
            } else {
                sb.append(str.toUpperCase().charAt(i));
            }
        }

        System.out.println(sb);
    }
}