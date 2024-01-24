package solutions;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        String path = "";
        dfs(root, result, path);
        return result;
    }

    private void dfs(TreeNode root, List<String> result, String path) {
         if(root.left == null && root.right == null) {
             result.add(path + root.val);
         }

         if(root.left != null) {
             dfs(root.left, result, path + root.val + "->");
         }
         if(root.right != null) {
             dfs(root.right, result, path + root.val + "->");
         }
    }
}
