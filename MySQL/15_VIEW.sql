/* VIEW */
-- SELECT 쿼리문을 저장한 객체로 가상테이블이라고 불린다.
-- 실질적인 데이터를 물리적으로 저장하고 있지 않음
-- 테이블을 사용하는 것과 동일하게 사용할 수 있다.
select * from tbl_menu;

-- view 생성
create view hansik as
select
		menu_code,
        menu_name,
        menu_price,
        category_code,
        orderable_status
        from tbl_menu
        where category_code = 4;

-- 생성된 view 조회
select * from hansik;


-- 베이스 테이블의 정보가 변경되면 view 결과도 같이 변경된다.
insert into tbl_menu values (null, '식혜맛국밥', 5500, 4, 'Y');

-- view를 통한 dml
-- 1)view를 통한 insert(view는 auto_increment가 없으므로 pk 컬럼의 값을 지정해 주어야 한다.)
insert into hansik values (99, '수정과국밥', 5500, 4, 'Y');

-- 2)view를 통한 update
update hansik
	set menu_name = '버터맛국밥',
		menu_price = 5700
        where menu_code = 99;

select* from hansik;
select * from tbl_menu;
-- 3)view를 통한 delete
delete from hansik where menu_code = 99;
select * from hansik;
select * from tbl_menu;

-- view 삭제
drop view hansik;