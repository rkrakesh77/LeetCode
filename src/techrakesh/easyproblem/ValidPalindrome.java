package techrakesh.easyproblem;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  //TRUE
        System.out.println(isPalindrome("race a car"));   //FALSE
        System.out.println(isPalindrome("0P"));    //FALSE
        System.out.println(isPalindrome("9,8"));   //FALSE
    }

    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
                    || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'
                    || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                str.append(s.charAt(i));
            }
        }
        if (str.toString().equalsIgnoreCase(str.reverse().toString())) {
            return true;
        }
        return false;
    }
}
