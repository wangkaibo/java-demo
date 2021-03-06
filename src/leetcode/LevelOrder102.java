package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder102 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 二叉树层序遍历
     * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder (TreeNode root){
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<TreeNode> currentNodes = queue;
            List<Integer> currentRes = new ArrayList<>();
            queue = new LinkedList<>();
            while (!currentNodes.isEmpty()) {
                TreeNode current = currentNodes.poll();
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                currentRes.add(current.val);
            }
            ret.add(currentRes);
        }

        return ret;
    }
}
