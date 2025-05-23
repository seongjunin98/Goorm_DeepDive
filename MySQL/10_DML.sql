/* DML(Data Manipulation Language)*/
-- INSERT, UPDATE, DELETE, SELECT
-- : 데이터 조작 언어, 테이블의 값을 삽입하거나, 수정하거나, 삭제하거나 조회하는 언어

/* INSERT */
-- 새로운 행을 추가하는 구문이다.
-- 테이블의 행 수가 증가된다.
insert into tbl_menu values (null, '바나나해장국', 8500, 4, 'Y');

-- null 허용 가능한(nullable)컬럼이나, auto_increment가 있는 컬럼을 제외하고
-- insert 하고싶은 데이터 컬럼을 지정해서 insert가 가능하다.
insert into tbl_menu(menu_name, menu_price, category_code, orderable_status)
values ('초콜릿죽', 6500, 7, 'y');

select * from tbl_menu;
insert into tbl_menu(orderable_status, menu_name, menu_price, category_code)
values ('y', '파인애플튀김', 5500, 4);

insert into tbl_menu
values
(null, '참치', 1700, 12, 'Y'),
(null, '멸치', 1500, 11, 'Y'),
(null, '다람쥐', 1700, 12, 'Y');

/* UPDATE */
-- 테이블에 기록된 컬럼의 값을 수정하는 구문이다.
-- 테이블의 전체 행 갯수는 변화가 없다.
select
		menu_code,
        category_code
        from tbl_menu
        where menu_name = '파인애플튀김';
        
        update tbl_menu
        set category_code = 6
        where menu_code = '24';

/* DELETE */ 
-- 테이블의 행을 삭제하는 구문이다.
-- 테이블의 행의 갯수가 줄어든다.
select
		menu_price
        from tbl_menu
        order by menu_price;
        

-- limit을 활용한 행 삭제
delete from tbl_menu
order by menu_price
limit 2;
-- where절을 활용한 단일 행 삭제
delete 
	from tbl_menu
    where menu_code = 24;


select * from tbl_menu;

-- 해당 테이블 전체 행 삭제
delete from tbl_menu;

/* REPLACE */
-- INSERT 시 PRIMARY KEY 또는 UNIQUE KEY가 충돌이 발생할 수 있다면
-- REPLACE를 통해 중복 된 데이터를 덮어 쓸 수 있다.
-- insert into tbl_menu values(17, '참기름', 5000, 10, 'y');
replace into tbl_menu values(17, '참기름', 5000, 10, 'y');

-- into 생략 가능하다.
replace tbl_menu values(17, '참기름', 5000, 10, 'y');
