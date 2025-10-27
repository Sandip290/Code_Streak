import java.util.ArrayList;
import java.util.List;


public class BT_Inorder {

    public void inorder(TreeNode root, List<Integer> arr) {
        if (root == null){
            return;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    public List<Integer> inOrder(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        inorder(root, arr);
        return arr;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(42);
        root.right = new TreeNode(33);
        root.left.left = new TreeNode(34);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(36);
        root.right.right = new TreeNode(57);
        List<Integer> result = new BT_Inorder().inOrder(root);

        System.out.println("Inorder result: " + result);
    }


}
