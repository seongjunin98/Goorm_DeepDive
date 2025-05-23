package com.seongjun.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{

    /* Computer는 하나의 Product이지만, 모든 Product는 Computer가 아니다. (IS-A) */

    private String cpu;                  //cpu
    private int hdd;                     //hdd
    private int ram;                     //ram
    private String operationSystem;      //운영체

    /* 기본생성자 */
    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    /* 모든 필드를 초기화하는 생성자 */
    public Computer(String cpu, int hdd, int ram, String operationSystem) {

        /* 부모클래스의 기본생성자 호출 */
        super();

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Conputer 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    /* 부모의 필드도 모두 초기화하는 생성자 */
    public Computer(String code, String brand, String name, int price, Date manufacturingDate,
                    String cpu, int hdd, int ram, String operationSystem) {

        /* 부모의 모든 필드를 초기화하는 생성자로 Product클래스가 가진 필드를 초기화 할 값 전달 */
        super(code, brand, name, price, manufacturingDate);

        /* 나머지 필드를 초기화 */
//		this(cpu, hdd, ram, operationSystem);	//에러남

        /*  위처럼 하고싶지만 this()로 위에 작성한 생성자를 호출한다는 의미는
         *  super()를 두 번 호출하는 것과 같기 때문에 허용되지 않는다.
         *  부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한 번만 호출 가능하다.
         * */

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출함...");
    }

    public String getCpu() {return cpu;}

    public void setCpu(String cpu) {this.cpu = cpu;}

    public int getHdd() {return hdd;}

    public void setHdd(int hdd) {this.hdd = hdd;}

    public int getRam() {return ram;}

    public void setRam(int ram) {this.ram = ram;}

    public String getOperationSystem() {return operationSystem;}

    public void setOperationSystem(String operationSystem) {this.operationSystem = operationSystem;}

    /* Product 클래스에 작성한 getInformation클래스를 오버라이딩 해서 작성한다. */
    @Override
    public String getInformation(){

        /*  Computer에 있는 getInformation()에서 이미 작성해둔 필드를 문자열로 반환하는 내용이 있다.
         *  오버라이딩을 하지만 부모클래스에 작성한 메소드를 호출해서 반환받은 문자열에
         *  현재 클래스의 필드값을 추가로 덧붙여 반환해보자
         *  */

        return super.getInformation()
                + "Computer ["
                + "cpu=" + this.cpu
                + ", hdd=" + this.hdd
                + ", ram=" + this.ram
                + ", operationSystem=" + this.operationSystem
                + "]";
    }
}
