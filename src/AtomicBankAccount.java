import java.util.concurrent.atomic.AtomicInteger;

public class AtomicBankAccount {
    private AtomicInteger balance = new AtomicInteger(1000);
    public void withdraw(int amount){
        if(balance.get() >= amount){
            System.out.println(Thread.currentThread().getName() + " dang rut tien: " + amount);
            balance.addAndGet(-amount);
            System.out.println(Thread.currentThread().getName() + " rut thanh cong , so du con lai: " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " khong the rut tien, so du khong du!");
        }
    }
    public static void main(String[] args){
        AtomicBankAccount account = new AtomicBankAccount();
        Runnable task = () -> {
            account.withdraw(700);
        };
        Thread t1 = new Thread(task, "User1");
        Thread t2 = new Thread(task, "User2");
        t1.start();
        t2.start();
    }

}
