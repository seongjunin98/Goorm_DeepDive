/* CAST FUNCTION */

/* 명시적 형변환(Explicit Conversion) */
-- CAST (expression AS 데이터형식 [(길이)])
-- CONVERT (expression, 데이터형식 [(길이)] 
-- 데이터 형식으로 가능한 것은 BINARY, CHAR, DATE, DATETIME, DECIMAL, JSON, SIGNED INTEGER, TIME, UNSIGNED INTEGER 등이 있다.

select avg(menu_price) from tbl_menu;
select cast(avg(menu_price) as signed integer) as '평균 메뉴 가격' from tbl_menu;
select convert(avg(menu_price), signed integer) as '평균 메뉴 가격' from tbl_menu;

select cast('2025$9$25' as date);
select cast('2025/9/25' as date);
select cast('2025%9$%25' as date);
select cast('2025@9@25' as date);

select concat(cast(menu_price as char(5)), '원') from tbl_menu;

-- 카테고리별 메뉴 가격 합계 구하기
select
		category_code,
        concat(cast(sum(menu_price) as char(10)), '원')
        from tbl_menu
        group by category_code;

/* 암시적 형변환(Implicit Conversion) */
select '1'+ '2' ; -- 각 문자가 정수로 변환
select concat(menu_price, '원') from tbl_menu;
select '2024-09-25';
