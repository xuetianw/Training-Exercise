package MS.JavaAlgorithms.Tree.LevelOrderTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>(Arrays.asList(root));
        while (nodes.size() != 0) {
            List<TreeNode> levelNodes = new ArrayList<>();
            List<Integer> levelNum = new ArrayList<>();
            for (TreeNode node : nodes) {
                levelNum.add(node.key);
                if (node.left != null) {
                    levelNodes.add(node.left);
                }
                if (node.right != null) {
                    levelNodes.add(node.right);
                }
            }
            res.add(levelNum);
            nodes = levelNodes;
        }
        return res;
    }
}