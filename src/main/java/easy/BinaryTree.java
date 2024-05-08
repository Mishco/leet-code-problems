package easy;

public class BinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 1. both empty
        if (p == null && q == null)
            return true;

        // 2. both non-empty . compare them
        if (p != null && q != null) {
            return
                    (
                            p.val == q.val &&
                                    isSameTree(p.left, q.left) &&
                                    isSameTree(p.right, q.right)
                    );
        }

        // 3. one empty, one not . false
        return false;
    }

}
