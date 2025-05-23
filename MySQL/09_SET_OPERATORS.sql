/* SET OPERATORS */
-- SET 연산자는 두 개 이상의 SELECT문의 결과 집합을 결합하는데 사용한다.
-- SET 연산자를 통해 결합하는 결과 집합의 컬럼이 동일해야 한다.

/* UNION */
-- 두 개 이상의 SELECT 문의 결과를 결합하여 중복된 레코드를 제거한 후 반환하는 연산자
select
		menu_code,
        menu_name,
        menu_price,
        category_code,
        orderable_status
        from tbl_menu
        where category_code = 10
        union
select
		menu_code,
        menu_name,
        menu_price,
        category_code,
        orderable_status
        from tbl_menu  
        where menu_price >= 9000;

/* UNION ALL */ 
-- 두 개 이상의 SELECT문의 결과를 결합하여 중복된 레코드를 제거하지 않고 모두 반환
select
		menu_code,
        menu_name,
        menu_price,
        category_code,
        orderable_status
        from tbl_menu
        where category_code = 10
        union all
select
		menu_code,
        menu_name,
        menu_price,
        category_code,
        orderable_status
        from tbl_menu  
        where menu_price >= 9000;

/* INTERSECT */ 
-- 두 개 SELECT문의 결과 중 공통되는 레코드만을 반환하는 연산자이다.
-- MYSQL INTERSECT를 제공하지 않는다.
-- 하지만 INNER JOIN또는 IN연산자 활용해서 구현하는 것은 가능하다. 
-- INNER JOIN 활용
SELECT
       A.MENU_CODE
     , A.MENU_NAME
     , A.MENU_PRICE
     , A.CATEGORY_CODE
     , A.ORDERABLE_STATUS
  FROM TBL_MENU A
  INNER JOIN (SELECT
                     MENU_CODE
                   , MENU_NAME
                   , MENU_PRICE
                   , CATEGORY_CODE
                   , ORDERABLE_STATUS
                FROM TBL_MENU
               WHERE MENU_PRICE < 9000) B ON (A.MENU_CODE = B.MENU_CODE)
WHERE A.CATEGORY_CODE = 10;

-- IN 연산자 활용
SELECT
       MENU_CODE
     , MENU_NAME
     , MENU_PRICE
     , CATEGORY_CODE
     , ORDERABLE_STATUS
  FROM TBL_MENU
 WHERE CATEGORY_CODE = 10 AND MENU_CODE IN (SELECT
                                                   MENU_CODE
                                              FROM TBL_MENU
                                             WHERE MENU_PRICE < 9000); 
