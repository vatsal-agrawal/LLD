
public class MirrorTree {
    public static void preorder(TreeNode node){
        if(node == null) return;

        preorder(node.left);
        System.out.println(node.data);
        preorder(node.right);
    }

    public static TreeNode convertMirror(TreeNode node) {
        if(node == null) return null;
//        TreeNode root = new TreeNode(node.data);

        TreeNode left = convertMirror(node.left);
        TreeNode right = convertMirror(node.right);

        node.right = left;
        node.left = right;
        return node;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        preorder(tree);
        TreeNode converted = convertMirror(tree);
        preorder(converted);

    }
}
