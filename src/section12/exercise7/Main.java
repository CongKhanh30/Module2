package section12.exercise7;

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

    BinarySearchTree() {
        root = null;
    }

    // Hàm gọi để thực hiện việc xoá một phần tử
    void deleteKey(int key) {
        root = deleteNode(root, key);
    }

    // Hàm đệ qui để xoá một phần tử trong cây
    Node deleteNode(Node root, int key) {
        // Nếu cây rỗng
        if (root == null)
            return root;

        // Nếu khóa cần xoá nhỏ hơn khóa của nút gốc, đi xuống cây con bên trái
        if (key < root.key)
            root.left = deleteNode(root.left, key);

            // Nếu khóa cần xoá lớn hơn khóa của nút gốc, đi xuống cây con bên phải
        else if (key > root.key)
            root.right = deleteNode(root.right, key);

            // Nếu khóa cần xoá bằng khóa của nút gốc, thực hiện việc xoá nút gốc
        else {
            // Nút chỉ có một hoặc không có con
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Nút có cả hai con: tìm phần tử nhỏ nhất trong cây con bên phải (hoặc phần tử lớn nhất trong cây con bên trái)
            root.key = minValue(root.right);

            // Xoá phần tử nhỏ nhất trong cây con bên phải
            root.right = deleteNode(root.right, root.key);
        }

        return root;
    }

    // Hàm hỗ trợ để tìm phần tử nhỏ nhất trong một cây
    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Hàm gọi để in ra cây
    void inorder() {
        inorderRec(root);
    }

    // Hàm đệ qui để in ra cây theo thứ tự tăng dần
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
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

        System.out.println("Cây tìm kiếm nhị phân ban đầu:");
        tree.inorder();

        int keyToDelete = 30;
        tree.deleteKey(keyToDelete);
        System.out.println("\nCây tìm kiếm nhị phân sau khi xoá phần tử " + keyToDelete + ":");
        tree.inorder();
    }
}
