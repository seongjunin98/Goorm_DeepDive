/* JOIN */
/* JOIN은 두 개 이상의 테이블을 관련 있는 컬럼을 통해 결합하는데 사용된다.
두 개 이상의 테이블은 반드시 연관 있는 컬럼이 존재해야 하며 이를 통해 JOIN된 테이블들의 컬럼을 모두 활용할 수 있다. */

/* ALIAS */
/* SQL문의 컬럼 또는 테이블에 별칭을 달아줄 수 있다. 이러한 별칭을 ALIAS라고 한다. */
select
		menu_code as 'code',
        menu_name name,
        menu_price 'price'
        from tbl_menu
        order by menu_price;

-- 테이블 별칭
-- 테이블에 별칭을 작성할 수 있으며 어떤 테이블 소속인지를 쉽게 알 수 있게 한다.
-- 테이블 별칭은 AS를 써도 되고 생략도 가능하다.
select
		a.category_code,
        a.menu_name
        from tbl_menu a
        order by a.category_code,
				 a.menu_name;
                 

/* INNER JOIN */
-- 두 테이블의 교집합을 반환하는 SQL JOIN
-- INNER JOIN INNER 키워드는 생략이 가능하다.
-- ON을 활용한 JOIN : 컬럼명이 같거나 다를 경우 ON으로 서로 연관있는 컬럼에 대한 조건을 작성하여 JOIN
select
		a.menu_name,
        b.category_name
   from tbl_menu a
  -- inner join tbl_category b on a.category_code = b.category_code
   join tbl_category b on a.category_code = b.category_code;

/* USING */
-- 컬럼명이 같을 경우 USING으로 서로 연관있는 컬럼에 대한 조건을 작성하여 JOIN
select
       a.menu_name
	 , b.category_name
  from tbl_menu a  
 inner join tbl_category b using(category_code);

/* LEFT JOIN */ 
-- 첫 번째(왼쪽)테이블의 모든 레코드와 두 번째(오른쪽)테이블에서 일치하는 레코드를 반환하는 JOIN
select
       a.category_code
     , b.menu_name
  from tbl_category a
  left join tbl_menu b on a.category_code = b.category_code;

/* RIGHT JOIN */  
-- 두 번째(오른쪽) 테이블의 모든 레코드와 첫 번째(왼쪽) 테이블에서 일치하는 레코드를 반환하는 JOIN
select
		a.menu_name,
        b.category_name
        from tbl_menu a
        right join tbl_category b on a.category_code = b.category_code;
 
 /* CROSS JOIN */  
-- 두 테이블의 모든 가능한 조합을 반환하는 JOIN
select
       a.menu_name
     , b.category_name
  from tbl_menu a
  cross join tbl_category b;

/* SELF JOIN */  
-- 같은 테이블 내에서 행과 행 사이의 관계를 찾기 위해 사용되는 SQL JOIN 유형

-- 카테고리별 대분류 확인을 위한 SELF JOIN 조회
select
		a.category_name,
        b.category_name
        from tbl_category a
        join tbl_category b on a.ref_category_code = b.category_code
        where a.ref_category_code is not null;