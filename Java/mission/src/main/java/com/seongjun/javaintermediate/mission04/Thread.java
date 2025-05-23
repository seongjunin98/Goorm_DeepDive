package com.seongjun.javaintermediate.mission04;

class SimpleTask implements Runnable {

    private String taskName;

    public SimpleTask(String name){
        this.taskName = name;
    }

    @Override
    public  void  run(){
        System.out.println("스레드 " + taskName + " 시작.");

        for(int i = 0; i<=5; i++){
            System.out.println("스레드" + taskName + ": 작업 " + i + " 수행 중...");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e){
                System.out.println("스레드 " + taskName + "중단.");
            }
        }

        System.out.println("스레드" + taskName + "종료.");
    }
}
