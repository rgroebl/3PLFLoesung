public class TreeNode {
    private int data;
    private TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
