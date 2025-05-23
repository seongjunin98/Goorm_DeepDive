package com.seongjun.javaintermediate.mission09;

public class Aplication {

    // 목표. 직원 클래스와 관리자 클래스 작성하기
    // 정보. 직원 클래스를 작성하고, 이름과 급여를 저장하는 멤버 변수를 가집니다. 관리자 클래스를 작성하고, 직원 클래스를 상속받습니다. 관리자의 직책을 저장하는 멤버 변수를 추가합니다. 직원 클래스와 관리자 클래스에서 오버라이딩된 메서드를 호출하여 결과를 출력합니다. 결과물로 직원과 관리자 객체를 생성하고 오버라이딩된 메서드를 호출하여 출력하는 스크린샷을 제출합니다.

    public static void main(String[] args){

        Employee employee = new Employee("김민정", 3000000);
        System.out.println("직원 정보 : " + employee.getDetails());

        Manager manager = new Manager("장원영", 5000000, "팀장");
        System.out.println("관리자 정보 : " + manager.getDetails());
        manager.manageTeam();

        Employee employee2 = new Manager("김유나", 4500000, "매니저");
        System.out.println("업캐스팅된 관리자 정보 : " + employee2.getDetails());


    }
}
