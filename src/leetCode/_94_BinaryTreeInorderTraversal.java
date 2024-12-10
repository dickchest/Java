package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94_BinaryTreeInorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();

        while (current != null || !stack.isEmpty()) {
            // забить в стек все левые узлы
            while (current != null) {
                stack.add(current);
                current = current.left;
            }
            // добавить в результат узел из стека
            current = stack.pop();
            output.add(current.val);
            // идти вправо
            current = current.right;
        }
        return output;
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
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
