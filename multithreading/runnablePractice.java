package collection.multithreading;
class ThreadTwo implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread two running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}
public class runnablePractice {
    public static void main(String[] args) throws InterruptedException {
        Runnable t1=()-> {//Lambda expression
            for(int i=0;i<5;i++){
                System.out.println("Thread one running...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {}
            }
        };
        Thread thread1=new Thread(t1);
        System.out.println("Thread one started");
        thread1.start();
        ThreadTwo t2=new ThreadTwo();
        Thread thread2=new Thread(t2);
        //thread1.join();
        System.out.println("Thread two started");
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Main thread running");
    }
}
