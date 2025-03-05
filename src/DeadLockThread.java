/*
deadlock (hay khoa chet) xay ra khi 2 tien trinh doi nhau hoan thanh
truoc khi chay ket qua cua qua trinh la ca hai tien trinh khong bao gio ket thuc
 */
public class DeadLockThread implements Runnable {

    private Object obj1;
    private Object obj2;

    public DeadLockThread(Object o1, Object o2) {
        obj1 = o1;
        obj2 = o2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " acquiring lock on " + obj1);
        synchronized (obj1) {
            System.out.println(name + " acquired lock on " + obj1);
            work();
            System.out.println(name + " acquired lock on " + obj2);
            synchronized (obj2) {//avoid nested lock
                System.out.println(name + " acquired lock on " + obj2);
                work();
            }
            System.out.println(name + " released lock on " + obj1);
            System.out.println(name + "finished execution.");
        }
    }

    private void work() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class DeadLockTest {

    public static void main(String[] args) throws InterruptedException {
        Object object1 = new String("Object1");
        Object object2 = new String("Object2");
        Object object3 = new String("Object3");
        Thread t1 = new Thread(new DeadLockThread(object1, object2), "t1");
        Thread t2 = new Thread(new DeadLockThread(object2, object3), "t2");
        Thread t3 = new Thread(new DeadLockThread(object3, object1), "t3");
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        t3.start();
    }
}