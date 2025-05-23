package com.seongjun.section02.superkeyword;

public class Application {

    public static void main(String[] args){

        /* 목표. super와 super()에 대해 이해할 수 있다. */

        /* Product 기본 생성자로 인스턴스 생성 후 정보 출력 */
        Product product1 = new Product();
        System.out.println(product1.getInformation());      //기본값으로 초기화됨

        /* Product의 모든 필드를 초기화하는 생성자로 인스턴스 생성 후 정보 출력 */
        Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴더2", 2390000, new java.util.Date());
        System.out.println(product2.getInformation());

        /* Computer 기본생성자로 인스턴스 생성 후 정보 출력 */
        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        /* Computer 모든 필드를 초기화하는 생성자로 인스턴스 생성 후 정보 출력 */
        Computer computer2 = new Computer("퀼컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer2.getInformation());

        /* Computer 부모필드도 함께 초기화하는 생성자로 인스턴스 생성 후 정보 출력 */
        Computer computer3 =
                new Computer("S-01234", "삼성", "갤럭시Z폴드2", 2398000, new java.util.Date()
                        , "퀼컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInformation());
    }
}
