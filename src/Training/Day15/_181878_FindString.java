package Training.Day15;

public class _181878_FindString {
    public int solution(String myString, String pat) {

        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}