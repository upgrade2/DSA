package trees;


import java.util.LinkedList;
import java.util.Queue;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaximumLevel_1161 {

    public int maxLevelSum(TreeNode root) {
        int maxSum=Integer.MIN_VALUE,maxLevel=0,currentLevel=1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size()>0){
            int size = queue.size();
            int sum=0;

            for (int i=0;i<size;i++){
                TreeNode cur = queue.poll();
                sum+=cur.val;
                if(cur.left!=null)queue.add(cur.left);
                if (cur.right!=null)queue.add(cur.right);
            }
            if(sum>maxSum){
                maxSum=sum;
                maxLevel=currentLevel;
            }
        currentLevel++;
        }
        return maxLevel;
    }
    public static void main(String[] args) {

    }

}

