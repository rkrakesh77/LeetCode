package techrakesh.easyproblem;

public class LongestCommonPrefixInArray {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(longestCommonPrefix(new String[]{""}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = "";
        int t = 0;
        while (t < strs[0].length()) {
            char first = ' ';
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() <= ans.length() || strs[i].length() == 0)
                    return ans;
                if (first == ' ' || first == strs[i].charAt(t))
                    first = strs[i].charAt(t);
                else
                    return ans;
            }
            ans = ans + first;
            t++;
        }
        return ans;
    }

    //Efficient approach
    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
