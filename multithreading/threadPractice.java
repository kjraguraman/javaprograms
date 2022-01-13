package collection.multithreading;
class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread1 running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}
class Thread2 extends  Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread 2 running...");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {}
        }
    }
}
public class threadPractice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
//        t1.setName("Thread 1");
//        t2.setName("Thread 2");
//        System.out.println("Thred one  name : "+t1.getName());
//        System.out.println("Thread two name : "+t2.getName());
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(10);
        System.out.println("Thread1 started");
        t1.start();
        //t2.start();
        //System.out.println("is thread1 alive? ->"+t1.isAlive());
        //t1.join();
        System.out.println("Thread2 started");
        t2.start();
        t2.join();
        //System.out.println("is thread1 alive? ->"+t1.isAlive());
        System.out.println("Main thread running...");
        //System.out.println("end");
    }
}
