package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeTest {

    @Test
    void test() {
//        p = [1,2,3], q = [1,2,3]
        var p = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        var q = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertTrue(new BinaryTree().isSameTree(p, q));
    }


    @Test
    void test2() {
        var p = new TreeNode(2, new TreeNode(1), null);
        var q = new TreeNode(1, null, new TreeNode(2));
        assertFalse(new BinaryTree().isSameTree(p, q));
    }

    @Test
    void testSimilarTreeDiffVal() {
        var p = new TreeNode(2, new TreeNode(1), new TreeNode(1));
        var q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        assertFalse(new BinaryTree().isSameTree(p, q));
    }


}