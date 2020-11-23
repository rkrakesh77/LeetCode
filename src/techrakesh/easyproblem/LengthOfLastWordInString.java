package techrakesh.easyproblem;

public class LengthOfLastWordInString {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord("Word"));
        System.out.println(lengthOfLastWord("This is mY laptop"));
        System.out.println(lengthOfLastWord("mzdjkhu 97218o30921 @"));
    }
    public static int lengthOfLastWord(String str) {
        int count=0;
        str=str.trim();
        if(str.length()==0)
            return 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' ') {
                return count;
            }else{
                count++;
            }
        }
        return count;
    }
    public static int lengthOfLastWord1(String s) {
        String words[]=s.split(" ");
        int size=words.length;
        int output=0;
        if(size==0){
            return output;
        }
        return words[size-1].length();
    }
}
