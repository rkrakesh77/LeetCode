package techrakesh.easyproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementsInArray {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{7,7,8,8,8,1,1,1,1}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2,5,5,5,5,5}));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else
                map.put(nums[i], 1);
        }
        int max = 0;
        int value = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                value = m.getKey();
            }
        }
        return value;
    }

}
