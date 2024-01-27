package solutions;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
    }

    private void traversal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left != null){
            traversal(root.left, list);
        }
        if(root.right != null){
            traversal(root.right, list);
        }

        list.add(root.val);
    }
}
