import java.util.ArrayList;
import java.util.List;

public class BT_Postorder {

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        postorder(root, arr);
        return arr;
    }

    public void postorder(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        postorder(root.left, arr);
        postorder(root.right, arr);
        arr.add(root.data);
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(33);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(54);
        root.right.left = new TreeNode(46);
        root.right.right = new TreeNode(57);

        List<Integer> result = new BT_Postorder().postOrder(root);
        System.out.println(result);
    }
}
