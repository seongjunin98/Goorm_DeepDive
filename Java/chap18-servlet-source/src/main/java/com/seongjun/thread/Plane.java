package com.seongjun.thread;

public class Plane implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            System.out.println("Plane Flight....");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
