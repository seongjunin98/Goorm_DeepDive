package com.seongjun.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){

        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public  void testPrimaryTypeArrayParameter(int[] iarr){

        System.out.println("매개변수로 전달받은 값 : " + iarr);

        System.out.print("배열의 값 출력 : ");
        for(int i=0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 배열의 0번인덱스에 값 변경 */
        iarr[0]= 99;

        System.out.println("변경 후 배열의 값 출력 : ");
        for(int i = 0; i< iarr.length;i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassTypeParameter(RectAngle rectAngle){

        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        /* 사각형의 넓이와 둘레 출력 */
        System.out.println("변경 전 사각형의 넓이와 둘 ===========================");
        rectAngle.calcArea();
        rectAngle.calcRound();

        /* 사각형의 너비와 높이를 변경 */
        rectAngle.setHeight(100);            //자동형변환 적용됨
        rectAngle.setWidth(100);

        /* 변경 후 사각형의 넓이와 둘레 출력 */
        System.out.println("변경 후 사각형의 넓이와 둘래 =========================");
        rectAngle.calcArea();
        rectAngle.calcRound();

    }

    public void testVariableLengthArrayParameter(String name, String...hobby) {

        /* 가변길이의 배열은 몇 개가 매개변수로 전달될지 모르는 상황이기에 이름과 구분하기 위해 뒤쪽에 작성해야 한다.
         *  앞쪽에 작성하는 경우 에러 발생함
         * */

        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.println("취미 : ");
        for (int i=0; i<hobby.length; i++){
            System.out.println(hobby[i] + " ");
        }
        System.out.println();
    }
}
