package com.seongjun.thread;

public class Tank extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <1000; i++){
            System.out.println("Tank Shooting...");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
