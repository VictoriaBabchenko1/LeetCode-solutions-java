public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        TreeNode temp = root;

        while (root != null){
            if(root.val > val){
                if(root.left != null){
                    root = root.left;
                }
                else{
                    root.left = new TreeNode(val);
                    break;
                }
            }
            else {
                if(root.right != null){
                    root = root.right;
                }
                else{
                    root.right = new TreeNode(val);
                    break;
                }
            }
        }

        return temp;

    }
}