package techrakesh.easyproblem;

public class MoveZerosToLast {
    public static void main(String[] args) {
        int[] res = new int[]{0, 1, 5, 0, 7, 0, 8, 4};
        moveZeroes(res);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int nonzero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[nonzero++] = nums[i];
        }
        for (int i = nonzero; i < nums.length; i++)
            nums[i] = 0;
    }

}
