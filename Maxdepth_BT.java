import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Maxdepth_BT {
    public int maxDepth(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int depth = 0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for (int i=0;i<size;i++){
                TreeNode step = q.poll();
                if(step.left != null){
                    q.add(step.left);
                }
                if(step.right != null){
                    q.add(step.right);
                }
            }
            depth = depth + 1;
        }
        return depth;
    }
}
