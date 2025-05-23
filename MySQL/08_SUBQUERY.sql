/* SUBQUERY */
-- SUBQUERY 다른 쿼리 내에서 실행되는 쿼리이다.
-- SUBQUERY의 결과를 활용해서 복잡한 MAINQUERY를 작성해 한번에 여러 작업을 수행할 수 있다.

-- 서브쿼리
-- 민트미역국 카테고리 번호 조회
select
		category_code
        from tbl_menu
        where menu_name = '민트미역국';

-- 메인쿼리
-- 다중열 결과 조회
select
		menu_code,
        menu_name,
        menu_price,
        category_code,
        orderable_status
        from tbl_menu;

-- 서브쿼리를 활용한 메인쿼리
-- 민트미역국과 같은 카테고리 메뉴 조회
select
		menu_code,
        menu_name,
        menu_price,
        category_code,
        orderable_status
	from tbl_menu
	where category_code = (select
									 category_code
								from tbl_menu
								where menu_name = '민트미역국');

-- 서브쿼리
select
		count(*) as 'count'
        from tbl_menu
        group by category_code;


-- 서브쿼리를 활용한 메인쿼리
select
		max(count)
				from (select
		count(*) as 'count'
				from tbl_menu
				group by category_code) as countmenu;

-- 상관 서브쿼리
-- 메인 쿼리가 서브쿼리의 결과에 영향을 주는 경우 상관 서브쿼리라고 한다.


-- 서브쿼리
select
		avg(menu_price)
        from tbl_menu;

-- 전체 메뉴 평균가격 보다 높은 가격의 메뉴 전체 조회
select
		menu_code,
        menu_name,
        menu_price,
        category_code,
        orderable_status
        from tbl_menu
        where menu_price > (select
									avg(menu_price)
									from tbl_menu);
