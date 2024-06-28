package solutions;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        return countNode(root);
    }

    private int countNode(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int l = countNode(node.left);
        int r = countNode(node.right);
        return l + r + 1;
    }
}
