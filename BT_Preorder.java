import java.util.ArrayList;
import java.util.List;


class PreorderIterator {
    public void preorder(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.data);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }

    public List<Integer> preOrder(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        preorder(root, arr);
        return arr;
    }
}

public class BT_Preorder {
    public static void main(String[] args) {
        PreorderIterator s = new PreorderIterator();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(23);
        root.right = new TreeNode(43);
        root.left.left = new TreeNode(34);
        root.left.right = new TreeNode(45);
        root.right.left = new TreeNode(46);
        root.right.right = new TreeNode(67);

        List<Integer> arr = s.preOrder(root);
        System.out.print("Preorder traversal : ");
        System.out.println(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

    }
}
