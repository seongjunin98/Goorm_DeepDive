/* ORDER BY */
/* ORDER BY절은 select문과 함께 사용하며 결과 집합을 특정 열이나 열들의 값에 따라 정렬하는 데 사용한다. */
select
		menu_code
      , menu_name
      , menu_price
   from tbl_menu
        -- order by menu_price asc;
   order by menu_price;
        
select
		menu_code
      , menu_name
      , menu_price
   from tbl_menu
   order by menu_price desc;        
        
select
		menu_code
      , menu_name
      , menu_price
   from tbl_menu
   order by menu_price desc,
            menu_name asc;
            
select
		menu_code
      , menu_name
      , menu_price * menu_code
   from tbl_menu
   order by menu_price * menu_code desc;
   
   select
		field(orderable_status, 'y', 'n')
        from tbl_menu;
        
	select
			menu_name
            , orderable_status
            from tbl_menu
            order by field(orderable_status, 'n', 'y');
	
    -- 오름차순 시 NULL 처음으로
    select
			category_code
            , category_name
            , ref_category_code
            from tbl_category
            order by ref_category_code;
            
-- 오름차순 시 NULL 마지막으로   
    select
			category_code
            , category_name
            , ref_category_code
            from tbl_category
            order by ref_category_code is null;
            
-- 내림차순 시 NULL 마지막으로            
select
			category_code
            , category_name
            , ref_category_code
            from tbl_category
            order by ref_category_code desc;
            
-- 내림차순 시 NULL 처음으로      
select
			category_code
            , category_name
            , ref_category_code
            from tbl_category
            order by ref_category_code is null desc, ref_category_code desc;      
            