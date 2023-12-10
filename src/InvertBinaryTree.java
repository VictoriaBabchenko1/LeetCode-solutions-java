public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private TreeNode invert(TreeNode root){
        if(root == null){
            return root;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left  = temp;

        invert(root.left);
        invert(root.right);
        return root;
    }
}
