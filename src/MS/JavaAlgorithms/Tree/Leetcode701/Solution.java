package MS.JavaAlgorithms.Tree.Leetcode701;

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        TreeNode prev = new TreeNode(0);
        TreeNode cur = root;
        int flag = - 1;
        while (cur != null) {
            prev = cur;
            if (val > cur.key) {
                cur = cur.right;
                flag = 1;
            } else {
                cur = cur.left;
                flag = 0;
            }
        }
        if (flag == 1) {
            prev.right = new TreeNode(val);
        } else {
            prev.left = new TreeNode(val);
        }
        return root;
    }
}