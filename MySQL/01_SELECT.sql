/* SELECT */
/* SELECT절은 MySQL의 가장 기본적인 명령어로 
특정 테이블에서 원하는 데이터를 조회해서 가져오는데 사용 된다.*/

select
       menu_name
  from tbl_menu;


select
       menu_code
     , menu_name
     , menu_price
from tbl_menu;
       
select
       *
  from tbl_menu;
  
  select 6 + 3;
  select 6 * 3;
  select 6 % 3;
  
  select now();
  
  -- 컬럼 별칭
select concat('홍', '', '길동') as name;      