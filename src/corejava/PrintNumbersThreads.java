package corejava;

class OddEvenPrinter {
    private int number = 1;
    private final int LIMIT = 10;

    synchronized void printOdd() throws InterruptedException {
        while (number <= LIMIT) {
            while (number % 2 == 0) {
                wait();
            }
            System.out.println("Odd: " + number++);
            notify();
        }
    }

    synchronized void printEven() throws InterruptedException {
        while (number <= LIMIT) {
            while (number % 2 != 0) {
                wait();
            }
            System.out.println("Even: " + number++);
            notify();
        }
    }
}

public class PrintNumbersThreads {
    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();

        new Thread(() -> {
            try { printer.printOdd(); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { printer.printEven(); } catch (Exception e) {}
        }).start();
    }
}
