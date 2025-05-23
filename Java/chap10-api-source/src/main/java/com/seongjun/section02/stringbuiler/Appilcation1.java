package com.seongjun.section02.stringbuiler;

public class Appilcation1 {

    public static void main(String[] args){

        /* String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */
        /* 수업목표. String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */
		/*  두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
		 *  StringBuilder : 스레드 동기화 기능 제공하지 않음
		 *                  스레드 동기화처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음
		 *  StringBuffer : 스레드 동기화 기능 제공 함
		 *                 성능면에서는 StringBuilder보다 느림
		 */

        StringBuilder sb1 = new StringBuilder();

        /* capacity() : 용량(현재 버퍼의 크기)을 정수형으로 반환하는 메소드 (문자열 길이 + 16이 기본 용량) */
        System.out.println(sb1.capacity());

        StringBuilder sb2 = new StringBuilder("javaoracle");

        /*  delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부문의 문자열을 제거한다.
         *  deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
         *  둘 다 원본에 영향을 미친다.
         *  */
        System.out.println("delete() : " + sb2.delete(2,5));        //jaracle
        System.out.println("deleteCharAt() : " + sb2.deleteCharAt(0));		//aracle

        System.out.println("sb2 : " + sb2);									//aracle


        /*  insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
         *  원본에 영향을 미친다.
         * */
        System.out.println("insert() : " + sb2.insert(1, "vao"));
        System.out.println("insert() : " + sb2.insert(0, "j"));
        System.out.println("insert() : " + sb2.insert(sb2.length(), "jdbc"));

        System.out.println("sb2 : " + sb2);

        /*  reverse() :  문자열 인덱스 순번을 역순으로 재배열한다.
         *  원본에 영향을 미친다.
         * */
        System.out.println("reverse() :" + sb2.reverse());
        System.out.println("sb2 : " + sb2);

    }
}
