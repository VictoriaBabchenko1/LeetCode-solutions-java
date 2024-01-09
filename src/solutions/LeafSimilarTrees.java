package solutions;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> tree1LeafValues = new ArrayList<>();
        List<Integer> tree2LeafValues = new ArrayList<>();

        collectLeafValues(root1, tree1LeafValues);
        collectLeafValues(root2, tree2LeafValues);

        return tree1LeafValues.equals(tree2LeafValues);
    }

    private void collectLeafValues(TreeNode root, List<Integer> treeLeafValues){
        if(root == null){
            return;
        }

        if(root.right == null && root.left == null){
            treeLeafValues.add(root.val);
        }

        collectLeafValues(root.left, treeLeafValues);
        collectLeafValues(root.right, treeLeafValues);
    }
}
