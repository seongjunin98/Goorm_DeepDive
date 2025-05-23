package com.seongjun.section03.Filterstream;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. BufferedWriter와 BufferedReader에 대해 이해하고 사용할 수 있다. */
        /*  java.io 패키지의 입출력 스트림은 기본 스트림과 필터 스트림으로 분류할 수 있다.
         *  기본 스트림은 외부 데이터에 직접 연결되는 스트림이고
         *  필터스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할 수 있는 스트림이다.
         *  주로 성능을 향상시키는 목적으로 사용되며 생성자를 보면 구분이 가능하다.
         *  생성자쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터스트림이라고 볼 수 있다.
         *  */

        /*  버퍼를 이용해서 성능 향상을 시키는 보조스트림
         *  BufferedWriter/BufferedReader
         * */

        /* BufferedWriter 인스턴스 생성 */
        BufferedWriter bw = null;


        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/seongjun/section03/filterstream/testBuffered.txt"));

            bw.write("안녕하세요\n");
            bw.write("반갑습니다.\n");

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
        /* close()를 호출하면 내부적으로 flush()를 하고 나서 자원을 반납한다. */
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /*  버퍼에 미리 읽어온 후 한 줄 단위로 읽어들이는 기능을 제공하며
         *  기본 스트림보다 성능을 개선시킨다.
         * */

        /* BufferedReader 인스턴스 생성 */
        BufferedReader br = null;

        try {
            br = new BufferedReader (new FileReader("src/main/java/com/seongjun/section03/filterstream/testBuffered.txt"));

            /*  readLine()을 추가로 제공한다.
             *  버퍼의 한 줄을 읽어와서 문자열로 반환한다.
             * */
            String temp;
            while ((temp = br.readLine()) != null){
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
