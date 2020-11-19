package techrakesh.easyproblem;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3};
        int res = removeElement(arr, 2);
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
