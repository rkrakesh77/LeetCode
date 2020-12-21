package techrakesh.easyproblem;

public class checkStringForAllTheLettersOfAlphabet {
    public static void main(String[] args) {
    System.out.println(checkStringForAllTheLetters("qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun"));
    System.out.println(checkStringForAllTheLettersUsingRegEx("qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun"));
    System.out.println(checkStringForAllTheLettersUsingStream("qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun"));
}
    public static boolean checkStringForAllTheLettersUsingRegEx(String s){
        return s.toLowerCase()
                .replaceAll("[^a-z]", "")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26;
    }
    public static boolean checkStringForAllTheLetters(String input) {
        int index = 0;
        boolean[] visited = new boolean[26];

        for (int id = 0; id < input.length(); id++) {
            if ('a' <= input.charAt(id) && input.charAt(id) <= 'z') {
                index = input.charAt(id) - 'a';
            } else if ('A' <= input.charAt(id) && input.charAt(id) <= 'Z') {
                index = input.charAt(id) - 'A';
            }
            visited[index] = true;
        }

        for (int id = 0; id < 26; id++) {
            if (!visited[id]) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkStringForAllTheLettersUsingStream(String input) {
        long c = input.toLowerCase().chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .distinct()
                .count();
        return c == 26;
    }
}
