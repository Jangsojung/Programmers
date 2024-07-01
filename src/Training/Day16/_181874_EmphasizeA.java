package Training.Day16;

public class _181874_EmphasizeA {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a", "A");

        return myString;
    }
}