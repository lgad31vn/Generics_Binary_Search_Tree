public class TreeNode<T>{
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }
    public TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}