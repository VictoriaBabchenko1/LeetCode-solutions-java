package solutions;

public class DistributeCoinsInBinaryTree {
    private int res = 0;
    public int distributeCoins(TreeNode root) {
        countSteps(root);
        return res;
    }

    private int countSteps(TreeNode root) {
        if(root == null) return 0;
        int left = countSteps(root.left);
        int right = countSteps(root.right);
        res += Math.abs(left) + Math.abs(right);

        return root.val + left + right - 1;
    }
}
