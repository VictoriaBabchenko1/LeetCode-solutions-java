package solutions;

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    private TreeNode construct(int[] nums, int start, int end){
        if(end - start < 1){
            return null;
        }

        int maxIndex = start;
        int maxValue = nums[maxIndex];
        for(int i = start + 1; i < end; i++){
            if(nums[i] > maxValue){
                maxValue = nums[i];
                maxIndex = i;
            }
        }

        TreeNode root = new TreeNode(maxValue);
        root.left = construct(nums, start, maxIndex);
        root.right = construct(nums, maxIndex + 1, end);
        return root;
    }
}
