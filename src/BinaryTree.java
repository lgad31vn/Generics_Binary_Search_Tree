import java.util.*;

public class BinaryTree<T extends Comparable<T>> {
    //root
    private TreeNode<T> root;

    // Constructor
    public BinaryTree(TreeNode<T> root) {
        this.root = root;
    }
    public BinaryTree() {
        this.root = null;
    }

    // Traverse through the tree
    // make sure its abstracted using private
    private void preOrder(TreeNode<T> root) {
        // base case
        if(root == null) {
            return;
        }
        // preOrder prints: root -> left -> right
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //public method for the client
    public void printPreOrder() {
        preOrder(root);
    }

    private void inOrder(TreeNode<T> root) {
        // base
        if (root == null) {
            return;
        }

        // inOrder prints: left -> root -> right
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public void printInOrder() {
        inOrder(root);
    }

    private void postOrder(TreeNode<T> root) {
        // base
        if (root == null) {
            return;
        }

        // inOrder prints: left -> right -> root
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }
    public void printPostOrder() {
        postOrder(root);
    }

    // add method
    private void add(T data, TreeNode<T> root) {
        //compare data versus the root.data
        if(data.compareTo(root.data) > 0) { // data > root.data
            //go to the right side
            if (root.right == null) {
                root.right = new TreeNode<T>(data); 
                return;
            }
            add(data, root.right);
        } else { // data < root.data
            if(root.left == null) {
                root.left = new TreeNode<T>(data);
                return;
            }
            add(data, root.left);
        }
    }
    public void add(T data) {
        if(this.root == null) {
            root = new TreeNode<T>(data);
        }
        add(data, root);
    }


    // contain method
    private boolean contains(T target, TreeNode<T> root) {
        // not contain target
        if( root == null) return false;
        
        //target == root.data ? true : false
        if(target.compareTo(root.data) == 0) {
            return true;
        }

        // target > root.data ? recursively traverse through the right : recursively traverse through the left
        if(target.compareTo(root.data) > 0) {
            return contains(target, root.right);
        } else {
            return contains(target, root.left); 
        }
        
    }
    public boolean contains(T data){
        return contains(data, root);
    }

    // TREE ROTATIONS
    // leftRotate 
    //   4              
    //    6     -->         6
    //     8              4   8
    public TreeNode<T> leftRotate(TreeNode<T> root) {
        TreeNode<T> temp = root.right;
        root.right = temp.left;
        temp.left = root;
        return temp;

    }
    // rightRotate 
    //   4
    //  6       -->         6
    // 8                  8   4
    public TreeNode<T> rightRotate(TreeNode<T> root) {
        TreeNode<T> temp = root.left;
        root.left = temp.right;
        temp.right = root;
        return temp;

    }

    // rightLeftRotate
    //    4                                          4                                      
    //      8       -->(rightRotate(root.right))       6         -->(leftRotate(root))      6
    //    6                                              8                                4   8
    public TreeNode<T> rightLeftRotate(TreeNode<T> root) {
        root.right = rightRotate(root.right);
        return leftRotate(root);
    }

    // rightLeftRotate
    //    4                                          4                                      
    //  8       -->(leftRotate(root.left))         6         -->(rightRotate(root))      6
    //    6                                      8                                     8   4
    public TreeNode<T> leftRightRotate(TreeNode<T> root) {
        root.left = leftRotate(root.left);
        return rightRotate(root);
    } 



}
