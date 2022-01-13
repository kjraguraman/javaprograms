package collection.multithreading;
class MultiplicationTable{
    synchronized void table(int n) throws InterruptedException {
        for(int i=1;i<=5;i++){
            System.out.println(i*n);
            Thread.sleep(2000);
        }
    }
}
public class synchronizedPractice {
//    synchronized static void table(int n) throws InterruptedException {
//        for(int i=1;i<=5;i++){
//            System.out.println(i*n);
//            Thread.sleep(2000);
//        }
//    }
    public static void main(String[] args) throws InterruptedException {
        MultiplicationTable mulTable=new MultiplicationTable();
        Thread t1=new Thread(){
            public void run() {
                try {
                    mulTable.table(5);
                } catch (InterruptedException e) {}
            }
        };
        Thread t2=new Thread(){
            public void run() {
                try {
                    mulTable.table(10);
                } catch (InterruptedException e) {}
            }
        };
        System.out.println("Thread 1 started");
        t1.start();
        //System.out.println("Thread 2 started");
        t2.start();
        //t1.join();
        mulTable.table(3);
        //System.out.println("Main thread running...");
    }
}
