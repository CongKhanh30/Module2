package section12.exercise6;

// Định nghĩa lớp đại diện cho một nút trong BST
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Lớp đại diện cho cây BST
class BinarySearchTree {
    Node root;

    // Hàm dùng để duyệt cây theo thứ tự post order
    void postorderTraversal(Node node) {
        if (node == null)
            return;

        // Bước 1: Duyệt cây con bên trái
        postorderTraversal(node.left);

        // Bước 2: Duyệt cây con bên phải
        postorderTraversal(node.right);

        // Bước 3: Truy cập nút gốc
        System.out.print(node.data + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo cây như trong hình minh họa
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(27);
        tree.root.left = new Node(14);
        tree.root.right = new Node(35);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(19);
        tree.root.right.left = new Node(31);
        tree.root.right.right = new Node(42);

        // Duyệt cây theo thứ tự post order
        System.out.println("Thứ tự post order:");
        tree.postorderTraversal(tree.root);
    }
}
