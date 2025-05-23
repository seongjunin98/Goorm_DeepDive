package com.seongjun.section01.intenum;

public class Application {

    public static void main(String[] args) {

        /* 목표. 정수 열거 패턴과 이의 단점을 이해할 수 있다. */
        /* 목차. 1. 정수값만을 저장하고 있는 필드일 뿐이다. */

        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        /* 둘 다 상수 0이라는 값을 가지기 때문에 이를 구분할 수 없다. */
        if(subject1==subject2){
            System.out.println("두 과목은 같은 과목입니다.");
        }

        /* 목차. 2. 이름 충돌 방지를 위해 접두어를 써서 구분해야 한다. */
        /*  BACKEND_JAVASCRIPT = 0;
         *  FRONTEND_JAVASCRIPT = 0;
         * */

        /* 목차. 3. 문자열로 출력하기 까다롭다.
		/*  경우에 따라서는 JAVA, HTML과 같은 상수 값을 문자열로 사용해야 하는 경우가 있다.
		 *  이런 경우 문자열로 출력하기 까다롭다.
		 * */
        int num = 0;
        String subjectText = "";

        switch (num){
            case Subjects.JAVA : subjectText = "JAVA"; break;
            case Subjects.ORACLE : subjectText = "ORACLE"; break;
            case Subjects.JDBC : subjectText = "JDBC"; break;
        }

        System.out.println("subjectText : " + subjectText);

        /* 목차. 4. 같은 그룹에 속한 상수들을 순회(반복문 사용)할 수 없다. (전체 상수의 갯수 확인도 불가능함) */

        /* 목차. 5. 타입 안전을 보장할 수 없다. (정수를 사용하기 때문) */
        printSubject(Subjects.ORACLE);
        printSubject(2);
    }

    public static void printSubject(int subjectNumber){

        String subject = "";

        switch (subjectNumber) {
            case Subjects.JAVA : subject = "JAVA"; break;
            case Subjects.ORACLE : subject = "ORACLE"; break;
            case Subjects.JDBC: subject = "JDBC"; break;
        }

        System.out.println("subject : " + subject);
    }
}
