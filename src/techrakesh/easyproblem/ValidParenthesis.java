package techrakesh.easyproblem;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(((())))"));  //TRUE
        System.out.println(isValid("(((()))"));   //FALSE
        System.out.println(isValid("({)}"));   //FALSE
        System.out.println(isValid("({}[])"));   //TRUE
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> maps = new HashMap<>();
        maps.put(')', '(');
        maps.put(']', '[');
        maps.put('}', '{');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (maps.containsKey(c)) {
                if ( stack.pop() != maps.get(c))
                    return false;
            } else
                stack.push(c);
        }
        return stack.empty();
    }
}
