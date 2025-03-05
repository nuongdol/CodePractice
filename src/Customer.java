/*
mo phong he thong rut tien ATM khach hang chi duoc rut tien
neu so tien rut nho hon so tien hien co trong tai khoan. Neu so tien rut lon hon so tien hien tai
co thi phai cho (wait) nap du tien moi duoc rut, sau khi nap tien thi thuc hien
thong bao(notify) co the tiep tuc xu ly rut tien.
 */
public class Customer {

    private int balancce = 1000;

    public Customer() {
        System.out.println("Tai khoan cua ban la: " + balancce);
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Dang thuc hien giao dich rut tien " + amount);
        while (balancce < amount) {
            System.out.println("Khong du tien rut");
            try {
                wait();//cho nap tien
            } catch (InterruptedException ie) {
                System.out.println(ie.toString());
            }
        }
        balancce -= amount;
        System.out.println("Rut tien thanh cong . Tai khoan cua ban hien tai la " + balancce);
    }

    public synchronized void deposit(int amount) {
        System.out.println("Dang thuc hien giao dich nap tien " + amount + "...");
        balancce += amount;
        System.out.println("Nap tien thanh cong. Tai khoan cua ban hien tai la " + balancce);
        notify();//thong bao nap tien
    }
}

class CustomerOperationExample {

    public static void main(String[] args) {
        final Customer c = new Customer();
        Thread t1 = new Thread() {
            public void run() {
                c.withdraw(2000);
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                c.deposit(500);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                c.deposit(3000);
            }
        };
        t2.start();
    }
}
