package com.seongjun.section06.finalkeyword;

public class FinalFieldTest {

    /* 목표. final 키워드에 대해 이해할 수 있다. */

    /* 목차. 1. non-static field에 final 사용 */

//	private final int nonStaticNum; 	//에러남		//0으로 초기화되어 이후 변경 불가능

    /* 이를 해결할 수 있는 방법은 2가지가 있다. */

    /* 목차. 1-1. 선언과 동시에 초기화 한다. */
    private final int NON_STATIC_NUM=1;

    /* 목차. 1-2. 생성자를 이용해서 초기화 함 */
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName) {this.NON_STATIC_NAME= nonStaticName; }

    /* 목차. 2. static field에 final 사용 */

//    private static final int STATIC_NUM;        //에러남           //0으로 초기화 되기 때무에 이후 변경 불가능
    private  static final int STATIC_NUM = 1;

    private  static final double STATIC_DOUBLE;

    /* 생성자로 초기화 불가 */
//	public FinalFieldTest(double staticDouble) {
//		FinalFieldTest.STATIC_DOUBLE = staticDouble;
//	}

    /* 하지만 초기화블럭으로는 초기화 할 수 있다. */
    /* 지금은 가능한거만 보고 필드에 대해 조금 더 정리한 뒤 초기화 블럭에 대해 다시 살펴보자 */
    static {
        STATIC_DOUBLE = 0.5;
    }
}
