package com.seongjun.section05.overloading;

public class Overloading {

    /* 목표. 오버로딩(Overloading)에 대해 이해할 수 있다. */

    public void test() {}

    /* 메소드의 시그니처가 동일한 경우 Compile Error를 발생시킨다. */
//	public void test() {}		//에러남

    /* 접근제한자에 따른 오버로딩 성립 확인 */
//	private void test() {}			//에러남	//접근제한자는 메소드 시그니처에 해당하지 않는다.

    /* 반환형에 따른 오버로딩 성립 확인 */
//	public int test() { return 0; }	//에러남	//반환형은 메소드 시그니처에 해당하지 않는다.

    /* 매개변수 유무에 따른 오버로딩 성립 확인 */
    public void test(int num) {}			//파라미터 선언부는 메소드 시그니처에 해당한다.

//	public void test(int num2) {}	//에러남	//매개변수의 이름은 메소드 시그니처에 영향을 주지 않는다.

    /* 매개변수 갯수에 따른 오버로딩 성립 확인 */
    public void test(int num1, int num2) {}

    /* 매개변수 타입 변화에 따른 오버로딩 성립 확인 */
    public void test(int num, String name) {}

    /* 매개변수의 순서에 따른 오버로딩 성립 확인 */
    public void test(String name, int num) {}
}
