package section12.exercise9;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    // Hàm tìm kiếm một phần tử trong cây
    boolean search(int key) {
        Node current = root;

        // Lặp đến khi current là null hoặc phần tử tìm thấy khớp với current.key
        while (current != null && key != current.key) {
            // Nếu phần tử nhỏ hơn current.key, đi xuống cây con bên trái
            if (key < current.key)
                current = current.left;
                // Nếu phần tử lớn hơn current.key, đi xuống cây con bên phải
            else
                current = current.right;
        }

        // Nếu current là null, cây con trống và phần tử không được tìm thấy trong cây
        // Nếu phần tử được tìm thấy, trả về true
        return current != null;
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Tạo BST như sau:
               50
            /     \
           30      70
          /  \    /  \
         20   40  60   80
        */
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        int keyToSearch = 40;

        // Tìm kiếm phần tử trong cây
        boolean found = tree.search(keyToSearch);

        if (found)
            System.out.println("Phần tử " + keyToSearch + " được tìm thấy trong cây.");
        else
            System.out.println("Phần tử " + keyToSearch + " không tồn tại trong cây.");
    }
}
