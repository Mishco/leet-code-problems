package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiameterBinaryTreeTest {

    @Test
    void simpleTest() {
        var tree = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        assertEquals(3, new DiameterBinaryTree().diameterOfBinaryTree(tree));
    }

    @Test
    void simpleTest2() {
        var tree = new TreeNode(1, new TreeNode(2), null);
        assertEquals(1, new DiameterBinaryTree().diameterOfBinaryTree(tree));
    }


}