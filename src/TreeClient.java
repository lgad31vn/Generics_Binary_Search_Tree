public class TreeClient {

    public static void main(String[] args) {
        TreeNode<Integer> root1 = new TreeNode<Integer>(10);
        TreeNode<Integer> node2 = new TreeNode<Integer>(6);
        TreeNode<Integer> node3 = new TreeNode<Integer>(15);
        TreeNode<Integer> node4 = new TreeNode<Integer>(4);
        TreeNode<Integer> node5 = new TreeNode<Integer>(7);
        TreeNode<Integer> node6 = new TreeNode<Integer>(12);
        TreeNode<Integer> node7 = new TreeNode<Integer>(18);
        root1.left = node2;
        root1.right = node3; 
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        BinaryTree<Integer> tree = new BinaryTree<Integer>(root1);
        // tree.add(20);
        // tree.add(19);
        // System.out.print("pre-order: ");
        // tree.printPreOrder();
        // System.out.println();

        // System.out.print("in-order: ");
        // tree.printInOrder();
        // System.out.println();

        // System.out.print("post-order: ");
        // tree.printPostOrder();
        // System.out.println();
        
        // System.out.println(tree.contains(5));
        
        // test tree rotation
        TreeNode<Integer> root2 = new TreeNode<>(4);
        TreeNode<Integer> node21 = new TreeNode<>(8);
        TreeNode<Integer> node31 = new TreeNode<>(6);

        root2.left = node21;
        node21.left = node31;

        BinaryTree<Integer> tree2 = new BinaryTree<>();
        TreeNode<Integer> node1 = tree2.rightRotate(root2);
        System.out.println(node1.left.data);
        System.out.println(node1.right.data);
        
        
    }
}
