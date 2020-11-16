package techrakesh.Nov2019;

public class ConsecutiveCharactersPrint {
    public static void main(String[] args) {
        //Given a string s,
        // the power of the string is the maximum length of a
        // non-empty substring that contains only one unique character.
        System.out.println(maxPower("triplepillooooow"));
        System.out.println(maxPower("cc"));
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("hooraaaaaaaaaaay"));
    }

    public static int maxPower(String s) {

       int max=0;
       int out=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                out=0;
            }
            if(s.charAt(i-1)==s.charAt(i)){
                out=out+1;
            }
            if(max<out) {
                max = out;
            }

        }
        return  max+1;
    }

}