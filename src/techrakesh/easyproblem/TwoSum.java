package techrakesh.easyproblem;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] res=twoSum(new int[]{2,7,11,5},9);
        System.out.println(res[0]+" "+res[1]);
        res=twoSum1(new int[]{2,7,11,5},9);

    }

    // O(n^2) Approach Time Limit Exceeded
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return  new int[]{0};
    }

    //Accepted
    public static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            else
                map.put(nums[i],i);
        }
        return null;
    }
}
