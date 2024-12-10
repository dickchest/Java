/*
100. Same Tree
Easy
Topics
Companies
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.



Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false


Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
 */


package leetCode;

public class _100_SameTree {

    public static void main(String[] args) {
        TreeNode p3 = new TreeNode(3);
        TreeNode p2 = new TreeNode(2);
        TreeNode p1 = new TreeNode(1, p2, p3);

        TreeNode q3 = new TreeNode(3);
        TreeNode q2 = new TreeNode(3);
        TreeNode q1 = new TreeNode(1, q2, q3);

        System.out.println(isSameTree(p1, q1));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }
}
