package solutions;

public class CountGoodNodesInBinaryTree {
    int count = 0;
    public int goodNodes(TreeNode root) {
        traversal(root, root.val);
        return count;
    }

    private void traversal(TreeNode root, int max){
        if(root == null){
            return;
        }

        if(root.val >= max){
            max = root.val;
            count++;
        }

        traversal(root.left, max);
        traversal(root.right, max);
    }
}
