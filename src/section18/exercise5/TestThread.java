package section18.exercise5;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();

        try {
            oddThread.join(); // Chờ OddThread hoàn thành trước khi tiếp tục
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.start();
    }
}
