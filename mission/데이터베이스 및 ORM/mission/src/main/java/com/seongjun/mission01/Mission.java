package com.seongjun.mission01;

public class Mission {

    /*
    * 1. MariaDB 데이터베이스에서 DDL(Data Definition Language) 쿼리를 사용하여 테이블을 생성합니다. CREATE TABLE 문을 사용하여 테이블을 정의하고, 실행 결과를 확인합니다. DDL 쿼리 실행 결과를 스크린샷으로 제출.
    * 2. MariaDB에서 DML(Data Manipulation Language) 쿼리를 사용하여 데이터를 조작합니다. INSERT, UPDATE, DELETE 등의 DML 쿼리를 작성하고, 실행 결과를 확인합니다. DML 쿼리 실행 결과를 스크린샷으로 제출.
    * 3. MariaDB에서 제공하는 다양한 데이터 유형(숫자, 문자, 날짜 등)을 사용하여 테이블을 생성합니다. 각 데이터 유형을 활용하는 예시를 작성하고, 실행 결과를 확인합니다. 데이터 유형 사용 예시와 결과를 스크린샷으로 제출.
    * 4. 어플리케이션의 요구사항을 분석하여 데이터베이스 테이블을 설계합니다. 테이블 간의 관계, 데이터 타입, 제약 조건 등을 고려하여 테이블을 정의합니다. 설계한 테이블 구조와 스크린샷을 제출.
    *       설계 : 온라인 쇼핑몰 어플리케이션
    *
    *       요구사항 : - 회원 관리 : 회원 정보를 저장.
    *                - 상품 관리 : 판매할 상품 정보를 저장.
    *                - 주문 관리 : 회원이 어떤 상품을 주문했는지 기록.
    *                - 주문 상품 상세 : 하나의 주문은 여러 개의 상품이 포함 될 수 있으므로, 주문에 포함된 상품의 정보를 기록.
    *
    *       설계 아이디어 :   1. users 테이블 : 회원 정보 저장
    *                       - id : 기본 키, 자동 증가
    *                       - username : 사용자 이름 (고유,필수)
    *                       - email : 이메일 (고유, 필수)
    *                       - password_hash : 비밀먼호 해시 (필수)
    *                       - created_atm update_at : 시간 정보
    *                     2. products 테이블 : 상품 정보를 저장.
    *                       - product_id : 기본 키, 자동 증가
    *                       - name : 상품명 (필수)
    *                       - price : 가격 (소수점 포함, 필수)
    *                       - stock_quantity : 재고 수량(정수, 기본값 0)
    *                       - description : 상품 설명 (선택 사항, 긴 텍스트)
    *                       - created_at, updated_at : 시간 정보
    *                   3. orders 테이블 : 주문 정보를 저장.
    *                       - order_id : 기본 키, 자동 증가
    *                       - user_id : 어떤 회원이 주문했는지(FK:users.id 참조, 필수)
    *                       - order_date : 주문 날짜 (필수, 기본값 현재 시각)
    *                       - total_amount : 총 결제 금액 (소수점 포함, 필수)
    *                       - state : 주문상태 (예: 'pending', 'completed', 'canceled' - ENUM 사용 가능)
    *                   4. order_items 테이블 : 주문된 상품 상세 정보를 저장
    *                       - order_item_id : 기본 키 , 자동 증가
    *                       - order_id : 어떤 주문에 속하는지 (FK:orders.order_id 참조, 필수)
    *                       - product_id : 어떤 상품인지(FK:products.product_id 참조, 필수)
    *                       - quantity : 주문 수량 (필수)
    *                       - price_at_order : 주문 당시 가격 (소수점 포함, 필수, 가격 변동 대비)
    *
    *       테이블 간의 관계 : - users 1 : N orders 한 명의 사용자는 여러 개의 주문을 할 수 있다.
    *                      - orders 1 : N order_items 하나의 주문은 여러 개의 주문 사움 항목을 가질 수 있다.
    *                      - products 1: N order_items 하나의 상품은 여러 주문 상품 항목에 포함될 수 있다.
    *                      - order_items 테이블은 orders 테이블과 products 테이블을 연결하는 조인 테이블 역할
    *
    * 5. 데이터베이스 성능 저하 요인을 분석하고, 최적화 방법을 적용합니다. 쿼리 튜닝, 인덱스 사용, 데이터 파티셔닝 등의 방법을 사용합니다. 최적화 전후의 성능 비교 결과를 스크린샷으로 제출.
    *
    * */
}
