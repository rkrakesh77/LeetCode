package techrakesh.easyproblem;

import java.util.Stack;

public class SuperReducedString {
    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));
    }

    static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty())
                stack.push(s.charAt(i));
            else if (stack.peek() == s.charAt(i))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        for (Character c:stack){
            sb.append(c);
        }if(stack.isEmpty())
            sb=new StringBuilder("");
        return sb.toString();
    }
}
