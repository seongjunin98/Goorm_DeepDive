/* TRANSACTION */
-- MYSQL 기본적으로 COMMIT이 자동으로 되므로 수동으로 조절하고 싶으면 AUTO COMMIT 설정을 바꿔 주어야 한다.

-- AUTO COMMIT 활성화
set autocommit = 1;
set autocommit = on;

-- AUTO COMMIT 비활성화
set autocommit = 0;
set autocommit = off;

-- START TRANSACTION 구문을 작성하고 DML 작업 수행후 COMMIT 또는 ROLLBACK을 하면 된다.
-- COMMIT 이후에도 ROLLBACK을 해도 ROLLBACK이 적용되지 않는다.
start transaction;

select * from tbl_menu;

insert into tbl_menu values(null, '바나나해장국', 8500, 4, 'Y');
update tbl_menu set menu_name = '수정된 메뉴' where menu_code = 5;
delete from tbl_menu where menu_code = 7;

rollback;

commit;