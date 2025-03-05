public class BankExample {
    public static void main(String[] args){
        BankAccountTest account = new BankAccountTest();
        Runnable task = () ->{
            account.withdraw(700);
        };
        Thread t1 = new Thread(task, "User1");
        Thread t2 = new Thread(task, "User2");

        t1.start();
        t2.start();
    }
}
class BankAccount{
    private int balance = 1000;
    public synchronized void withdraw(int amount){
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " dang rut tien: " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " rut thanh cong, so du con lai: " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " khong the rut tien, so du khong du");
        }
    }
}
/*
khi synchronized duoc them vao pt withdraw() chi mot luong co the thuc hien rut tien tai mto thoi
diem neu user1 rut truoc, user2 se thay so du khong du va khong the rut tiep
 */