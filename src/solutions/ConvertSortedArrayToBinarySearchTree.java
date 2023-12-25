package solutions;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums, 0, nums.length - 1);
    }

    private TreeNode create(int nums[], int left, int right){
        if(left > right){
            return null;
        }

        int m = (right + left) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = create(nums, left, m - 1);
        root.right = create(nums, m + 1, right);
        return root;
    }
}
