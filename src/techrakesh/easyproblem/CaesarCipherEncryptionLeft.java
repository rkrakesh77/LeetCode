package techrakesh.easyproblem;

public class CaesarCipherEncryptionLeft {
    public static void main(String[] args) {
        String result="";
        String s="abcd";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((int)c-3>=97){
                result+=(char)((int)c-3);
            }
            else {
                int check=97-(int)c;
                result+=(char)(122-2-check);
            }
        }
        System.out.println(result);

    }

}
