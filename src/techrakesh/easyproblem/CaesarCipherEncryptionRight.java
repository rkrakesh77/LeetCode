package techrakesh.easyproblem;

public class CaesarCipherEncryptionRight {
    public static void main(String[] args) {
        System.out.println(caesarCipherToLeft("ZABC",3));
        System.out.println(caesarCipherToRight("ZABC",3));
    }

    static String caesarCipherToLeft(String s, int k) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!Character.isAlphabetic(c))
                result+=c;
            else {
            int base=Character.isLowerCase(c)?'z':'Z';
            result=result+(char)((c-k-base)%26+base);
            }
        }
        return result;
    }
    static String caesarCipherToRight(String s, int k) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!Character.isAlphabetic(c))
                result+=c;
            else {
                int base=Character.isLowerCase(c)?'a':'A';
                result=result+(char)((c+k-base)%26+base);
            }
        }
        return result;
    }

}
