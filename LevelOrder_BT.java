import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder_BT {
   static void printList(List<Integer> list){
       for(int i=0;i<list.size();i++){
           System.out.print(list.get(i)+" ");
       }
   }

   public static void main(String[] args){
       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.right = new TreeNode(3);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
       root.right.left = new TreeNode(6);
       root.right.right = new TreeNode(7);

       LevelOrder levelOrder = new LevelOrder();
       List<List<Integer>> lists = levelOrder.levelOrder(root);
       for(List<Integer> list : lists){
           printList(list);
       }
   }
}

class LevelOrder{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                list.add(node.data);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
