package com.seongjun.section05.parameter;

public class Appilcation {

    public static void main (String[] args) {

        /* 목표. 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */

        /* 파라미터 타입별 호출 테스트 기능을 제공하는 ParameterTest 클래스 작성 후 인스턴스 생성 */

        ParameterTest pt = new ParameterTest();

        /* 목차. 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 확인 */

        int num = 20;

        pt.testPrimaryTypeParameter(num);

        /* 목차. 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 확인 */
        int[] iarr = new int[] {1,2,3,4,5};

        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testPrimaryTypeArrayParameter(iarr);

        /* 메소드 호출 후 값 변경 확인 */

        System.out.println("변경 후 원본 배열의 값 출력 : ");
        for (int i=0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 목차. 3. 클래스 자료형 */
        /* 사각형의 가로, 세로의 길이를 저장할 RectAngle이라는 클래스를 하나 추가한다. */
        RectAngle r1 = new RectAngle(12.5, 22.5);

        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testClassTypeParameter(r1);

        /* 메소드 호출 후 값 변경 확인 */
        System.out.println("변경 후 사각형의 넓이와 둘레 ====================");
        r1.calcArea();
        r1.calcRound();

        /* 목차. 4. 클래스 자료형 배열은 뒤에서 다룬다. */

        /* 목차. 5. 가변인자 */
        /* 인자로 전달하는 값의 갯수가 정해지지 않은 경우 가변배열을 활용할 수 있다. */

//        pt.testVariableLengthArrayParameter();			//에러남	//인자가 아무것도 없는 경우 에러 발생
        pt.testVariableLengthArrayParameter("홍길동");			//가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArrayParameter("유관순", "볼링");		//1개도 가능
        pt.testVariableLengthArrayParameter("이순신", "볼링", "축구", "당구");	//여러 개도 가능
        pt.testVariableLengthArrayParameter("신사임당", new String[] {"테니스", "서예", "떡썰기"});	//배열도 가능

    }

}
