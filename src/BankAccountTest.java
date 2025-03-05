import java.util.concurrent.locks.ReentrantLock;

public class BankAccountTest {

    private int balance = 1000;
    private final ReentrantLock lock = new ReentrantLock();

    public void withdraw(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " dang rut tien: " + amount);
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " rut tien thanh cong, so du con lai: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " khong the rut tien, so du khong du! ");
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        BankAccountTest accountTest = new BankAccountTest();
        Runnable task = () -> {
            accountTest.withdraw(700);
        };
        Thread t1 = new Thread(task, "User1");
        Thread t2 = new Thread(task, "User2");
        t1.start();
        t2.start();
    }
}
