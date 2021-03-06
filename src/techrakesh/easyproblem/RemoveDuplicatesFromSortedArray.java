package techrakesh.easyproblem;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int []arr=new int[]{0,0,1,1,2,2,2,2,3,4,5,5};
        int res=removeDuplicates(arr);
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return ++j;
    }
}
