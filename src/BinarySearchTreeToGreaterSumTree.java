public class BinarySearchTreeToGreaterSumTree {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root != null){
            sum += root.val;
            root.val = sum;
            bstToGst(root.right);
            bstToGst(root.left);
        }
        return root;
    }
}
