package solutions;

public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val){
            if(val < root.val){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return root;
//        if(root == null || root.val == val){
//            return root;
//        }
//
//        if(val < root.val){
//            return searchBST(root.left, val);
//        }
//        else{
//            return searchBST(root.right, val);
//        }
    }
}
