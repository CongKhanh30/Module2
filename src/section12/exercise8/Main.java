package section12.exercise8;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    // Hàm duyệt cây theo thứ tự pre order
    void preorderTraversal(Node node) {
        if (node == null)
            return;

        // Bước 1: Truy cập nút gốc
        System.out.print(node.data + " ");

        // Bước 2: Duyệt cây con bên trái
        preorderTraversal(node.left);

        // Bước 3: Duyệt cây con bên phải
        preorderTraversal(node.right);
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo cây như trong hình minh họa
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        // Duyệt cây theo thứ tự pre order
        System.out.println("Thứ tự pre order:");
        tree.preorderTraversal(tree.root);
    }
}

