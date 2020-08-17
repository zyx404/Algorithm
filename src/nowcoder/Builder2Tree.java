package nowcoder;

import nowcoder.common.TreeNode;

/**
 * 重建二叉树
 * <p>
 * 题目描述
 * <p>
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Builder2Tree {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return builder(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    public static TreeNode builder(int[] pre, int[] in, int startPre, int endPre, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn)
            return null;
        //根节点
        TreeNode treeNode = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (pre[startPre] == in[i]) {
                treeNode.left = builder(pre, in, startPre + 1, startPre + i - startIn, startIn, i - 1);
                treeNode.right = builder(pre, in, startPre + i + 1 - startIn, endPre, i + 1, endIn);
            }
        }
        return treeNode;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 3, 4, 5, 6, 7};
        int[] in = {3, 2, 4, 1, 6, 5, 7};
        TreeNode treeNode = reConstructBinaryTree(pre, in);
    }
}
