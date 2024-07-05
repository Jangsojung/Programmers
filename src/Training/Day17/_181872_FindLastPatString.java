package Training.Day17;

public class _181872_FindLastPatString {
    public String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat);

        return myString.substring(0, index + pat.length());
    }
}