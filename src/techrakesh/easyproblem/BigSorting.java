package techrakesh.easyproblem;

import java.math.BigInteger;
import java.util.*;

public class BigSorting {
    public static void main(String[] args) {
        String s[] = bigSorting(new String[]{"77","66",
                "31415926535897932384626433832795",
                "1",
                "3",
                "10",
                "3",
                "5"});
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    static String[] bigSorting(String[] unsorted) {

//        for (int i = 0; i < unsorted.length; i++) {
//            for (int j = 0; j < unsorted.length-1-i; j++) {
//                BigInteger bigInteger = new BigInteger(unsorted[j]);
//                BigInteger bigInteger1 = new BigInteger(unsorted[j+1]);
//                if (bigInteger.compareTo(bigInteger1)>0){
//                    String t=unsorted[j];
//                    unsorted[j]=unsorted[j+1];
//                    unsorted[j+1]=t;
//                }
//            }
//        }
        Arrays.sort(unsorted, (a, b) -> StringAsIntegerCompare(a,b));
        return unsorted;

//        Arrays.sort(unsorted, (x, y) -> x.length() == y.length() ?
//                x.compareTo(y) : Integer.compare(x.length(), y.length()));
//        return unsorted;

    }
    static int StringAsIntegerCompare(String s1, String s2)
    {
        if(s1.length() > s2.length()) return 1;
        if(s1.length() < s2.length()) return -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
        }
        return 0;
    }
}
