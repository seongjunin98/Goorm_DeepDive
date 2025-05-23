package com.seongjun.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) throws IOException {

        /* 목표. 입출력 스트림에 대해 이해하고 파일을 대상으로하는 FileInputStream을 사용할 수 있다. */
        /*  입출력과 관련된 API는 java.io 패키지에서 제공하고 있다.
         *  API 문서에서 목록을 확인해보면 대부분 InputStream/OutputStream, Reader/Writer 로 끝난다.
         *  이러한 클래스 모두가 외부 데이터를 읽어오는 기능을 가진 스트림이다.
         *
         *  그 중 InputStream과 Reader는 데이터를 읽어오는 입력스트림이고
         *  OutputStream과 Writer는 데이터를 내보내는 출력스트림이다.
         *  또한 InputStream과 OutputStream은 데이터를 1바이트 단위로 입/출력을 하고
         *  Reader와 Writer계열은 글자(2바이트 혹은 3바이트) 단위로 작업을 한다.
         *  참고로 MS949 인코딩에서는 한글 한 글자를 2바이트로 취급하지만 UTF-8에서는 한글 한 글자를 3바이트로 취급한다.
         *
         *  자바 프로그램과 연결되는 외부 데이터의 타입이 무엇인지는 클래스의 이름을 보고 유추가 가능하다.
         *  InputStream/OuputStream/Reader/Writer를 빼고 남은 단어가 바로 외부 데이터의 타입이다.
         *  예) FileInputStream은 InputStream을 제거하고 남은 단어가 File이므로 외부 데이터는 File임을 알 수 있다.
         * */

        /*  외부 데이터를 프로그램으로 읽어들이는 스트림은 입력스트림이라고 하고
         *  몇 바이트씩을 한 번에 처리하는지에 따라 InputStream과 Writer로 구분한다.
         *  그 중 먼저 InputStream에 대해 살펴보자
         * */

        /* testInputStream.txt.txt 파일을 대상으로 파일을 읽어올 수 있도록 스트림 인스턴스 생성 */
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/seongjun/section02/stream/testInputStream.txt");

            int value;

            /* read() : 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽어올 데이터가 없는 경우 -1 반환 */
            while ((value = fin.read()) != -1) {

                /* 값을 정수로 읽어 온다. */
                System.out.println(value);

                /* 문자로 출력하고 싶은 경우 형변환 */
                System.out.println((char) value);

            }
            /* File클래스의 length()로 파일의 길이를 알 수 있다. */
            System.out.println("파일의 길이 : " + new File("src/main/java/com/seongjun/section02/stream/testInputStream.txt").length());

            /* 파일의 길이 만큼의 byte 배열을 만든다 */
            int fileSize = (int) new File("src/main/java/com/seongjun/section02/stream/testInputStream.txt").length();
            byte[] bar = new byte[fileSize];

            /* read() 메소드의 인자로 생성한 byte 배열을 넣어주면 파일의 내용을 읽어서 byte 배열에 기록해준다. */
            fin.read(bar);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            /* fin 인스턴스가 null이 아닌 경우 자원 반납을 해야 한다. */
            if (fin != null){
                try {
                    /* 자원 반납을 해야 하는 이유
                     *  1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에서 누수(leak)가 발생한다.
                     *  2. 뒤에서 배우는 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야 한다.
                     *     만약 잔류 데이터가 남은 상황에서 추가로 스트림을 사용한다면 데드락(deadlock)상태가 된다.
                     *     판단하기 어렵고 의도하지 않는 상황에서도 이런 현상이 발생할 수 있기 때문에 마지막에는 flush()를
                     *     무조건 실행해주는 것이 좋다.
                     *     close()메소드는 자원을 반납하며 flush()를 해 주기 때문에 close()만 제대로 해 줘도 된다.
                     *     따라서 close() 메소드는 외부 자원을 사용하는 경우 반드시 마지막에 호출해줘야 한다.
                     * */
                    fin.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
