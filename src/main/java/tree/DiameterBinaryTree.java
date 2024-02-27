package tree;

public class DiameterBinaryTree {

    private int diameter = 0;

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);
        int currentDiameter = leftDepth + rightDepth;

        diameter = Math.max(diameter, currentDiameter);


        return 1 + Math.max(leftDepth, rightDepth);
    }

    public int diameterOfBinaryTree(TreeNode root) {

        depth(root);

        return diameter;
    }


}
