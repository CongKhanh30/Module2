package section11.exercise5;

public class Queue {
    private Node front;
    private Node rear;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        front = null;
        rear = null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            newNode.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng");
            return -1;
        }

        int value = front.data;

        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }

        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        System.out.println(queue.deQueue()); // Output: 10
        System.out.println(queue.deQueue()); // Output: 20
        System.out.println(queue.deQueue()); // Output: 30
        System.out.println(queue.deQueue()); // Output: Hàng đợi rỗng
    }
}
