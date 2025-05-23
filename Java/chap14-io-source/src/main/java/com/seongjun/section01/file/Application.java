package com.seongjun.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args){

        /* 목표. File 클래스의 사용 용법을 이해할 수 있다. */
        /* File을 이용한 스트림을 사용하기 앞서 File 클래스의 기본 사용 방법을 확인해보자 */

        /*  JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스 이다.
         *  대상 파일에 대한 정보로 인스턴스를 생성하고
         *  파일의 생성, 삭제 등등의 처리를 수행하는 기능을 제공하고 있다.
         * */

        File file = new File("src/main/java/com/seongjun/section01/file/test.txt");

        /* 파일을 새롭게 생성할 수 있다. */
        try {
            boolean createSuccess = file.createNewFile();
            /*  최초 실행하면 새롭게 파일이 만들어 지기 때문에 true을 반환하지만,
             *  파일이 한 번 생성되고 난 이후는 새롭게 파일을 만들지 않기 때문에 false를 반환한다.
             * */
            System.out.println("createSuccess : " + createSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        /* 절대 경로란 최상위 루트 위치부터의 경로를 의미한다. */
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

        boolean deleteSuccess = file.delete();

        // /* 삭제 이후에는 삭제가 되기 때문에 매번 실행할 때마다 파일 생성 결과는 true로 나오게 되니 참고 */
        System.out.println("deleteSuccess : " + deleteSuccess);


    }
}
