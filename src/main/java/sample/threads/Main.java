package sample.threads;

public class Main {

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread("resource1");
        MyThread myThread2 = new MyThread("resource2");


        //Case 1 (Multiple thread different object/resource)
//        new Thread(myThread1).start();
//        new Thread(myThread2).start();


        //Case 2 (Multiple thread same object/resource)
//        new Thread(myThread1).start();
//        new Thread(myThread1).start();


        //Case 3 (Hybrid of 2 and 1)
        new Thread(myThread1).start();
        new Thread(myThread1).start();
        new Thread(myThread2).start();


    }
}
