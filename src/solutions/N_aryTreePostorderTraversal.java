package solutions;
import java.util.ArrayList;
import java.util.List;

public class N_aryTreePostorderTraversal {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        traversal(root);
        return result;
    }

    private void traversal(Node root) {
        if(root == null) {
            return;
        }
        for(Node n : root.children) {
            traversal(n);
        }
        result.add(root.val);
    }
}
