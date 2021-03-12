package sample.threads;

//CASE here not refers to case in Main class

import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {

    private String str;
    public MyThread(String str){
        this.str = str;
    }

    //CASE 2
    private final Object lockObject = new Object();



    //CASE 4
    private Integer semap = 1;

    @Override
    public void run() {

//*******************************
//        //CASE 3
//        synchronized (MyThread.class){
//
//            //CASE 2
////            synchronized (lockObject){
//
//                //CASE 1
////                synchronized (this){
//
//                System.out.println("start " + str);
//
//                //processing
//                for(int j = 0;j<2;j++) {
//                    for (int i = 0; i < 1000000000L; i++) {
//                        int po = 0;
//                        po++;
//                    }
//                }
//
//                System.out.println("end " + str);
//            }

//        ******************************

        myWait();

        System.out.println("start " + str);

        //processing
        for(int j = 0;j<2;j++) {
                    for (int i = 0; i < 1000000000L; i++) {
                        int po = 0;
                        po++;
                    }
        }

        System.out.println("end " + str);

        mySignal();

    }

    private void myWait(){

        while(semap==0){
            //stuck
        }

        semap = 0;

    }

    private void mySignal(){

        semap = 1;
    }
}
