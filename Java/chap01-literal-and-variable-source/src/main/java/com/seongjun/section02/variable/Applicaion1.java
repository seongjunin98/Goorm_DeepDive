package com.seongjun.section02.variable;

public class Applicaion1 {

    public static void main(String[] args) {

        /* 목표. 변수의 사용 목적에 대해 이해 */
        /* 변수의 사용 목적
         *  1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워여 코드 읽기가 쉽고, 협업과 유지보수에  유리)
         *  2. 한 번 저장해둔 값을 재사용 하기 위한 목적(변수를 이용하여 코드를 작성하면, 값을 변경할 때도 간편하게 가능)
         *  3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다. (변하는 값을 저장하기 위한 공간이다.)
         */

        /* 목차. 1. 값에 의미를 부여하기 위한 목적 */
        System.out.println("================= 값에 의미 부여 테스트 ===================");
        /* 아래 처럼 작성하면 어느 값이 급여인지 어느 값이 보너스 금액인지 알 수 없다. */
        System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");
        /*따라서 변수를 지정, 정수 이기 때문에 int 사용 */
        int salary = 1000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");
        /* 한 번 저장해둔 값을 재사용하는 목적도 있다. */

        /* 시간에 따라 변경되는 값을 저장하고 사용 */
        System.out.println("========== 변수에 저장되있는 값 변경 테스트 ==========");
        int sum = 0;
        sum=sum+10;
        System.out.println("변수에 10을 더한 값은? " + sum);

        sum=sum-5;
        System.out.println("10을 더한 변수에 -5을 한 값은? "  + sum);
    }
}
