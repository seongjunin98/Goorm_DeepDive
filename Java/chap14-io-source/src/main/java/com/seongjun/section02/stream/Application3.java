package com.seongjun.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {

        /* 목표. FileOutputStream을 이해하고 사용할 수 있다. */
        /*  FileOutputStream
         *  프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
         *  1바이트 단위로 데이터를 처리한다.
         * */

        /* 파일에 데이터를 내보내기 할 스트림 생성 */
        FileOutputStream fout = null;

        /* 역시 FileNotFoundException을 핸들링 해야 한다. */
        try {
            fout = new FileOutputStream("src/main/java/com/seongjun/section02/stream/testOutputStream.txt");

            /* writer() 메소드는 IOException을 핸들링 해야 한다. */
            fout.write(97);

			/*  byte 배열을 이용해서 한 번에 기록할 수 도 있다.
             *  10 : 개행문자 (엔터)
             * */
            byte[] bar = new byte[] {98, 99, 100, 101, 102, 10};
            fout.write(bar);

            /* 1번 인덱스부터 3의 길이만큼 파일에 내보내기 (cde 기록됨) */
            fout.write(bar, 1, 3);


        } catch (FileNotFoundException e){
            e. printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fout != null){
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
