package com.seongjun.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. FileWriter를 이해하고 사용할 수 있다. */
        /*  FileWriter
         *  프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
         *  1 글자 단위로 데이터를 처리한다.
         * */

        /* 파일에 내보내기 할 스트림 생성 */
        FileWriter fw = null;

        /* 역시 FileNotFoundException을 핸들링 해야 한다. */
        try {
            fw = new FileWriter("src/main/java/com/seongjun/section02/stream/testWriter.txt");

            /* writer() 메소드는 IOException을 핸들링 해야 한다. */
            fw.write(97);

            /* 문자 기반 스트림은 직접 char 자료형으로 내보내기도 가능하다. */
            fw.write('A');

            /* 혹은 char 배열도 가능하며 */
			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});

            /* 문자열도 가능하다. */
			fw.write("우리나라 대한민국");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw !=null){
                try {
                    fw.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
