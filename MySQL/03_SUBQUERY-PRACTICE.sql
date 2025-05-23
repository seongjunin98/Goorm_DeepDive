-- 1. 부서코드가 노옹철 사원과 같은 소속의 직원 명단 조회하세요.
select *
from employee
where dept_code like
(select
	 dept_code
     from employee
     where emp_name like '노옹철');
     

-- 2. 전 직원의 평균 급여보다 많은 급여를 받고 있는 직원의 사번, 이름, 직급코드, 급여를 조회하세요.
select
		emp_id,
		emp_name,
		dept_code,
		salary
	from employee
    where salary >
					(select
							avg(salary)
							from employee);

-- 3. 노옹철 사원의 급여보다 많이 받는 직원의 사번, 이름, 부서코드, 직급코드, 급여를 조회하세요.
select
		emp_id,
        emp_name,
        dept_code,
        job_code,
        salary
	from employee
	where salary >
					(select
								salary
							from employee
							where emp_name = '노옹철');

-- 4. 가장 적은 급여를 받는 직원의 사번, 이름, 부서코드, 직급코드, 급여, 입사일을 조회하세요.
select
		emp_id,
		emp_name,
        dept_code,
        job_code,
        salary,
        hire_date
	from employee
    where salary = 
					(select
							min(salary)
                            from employee);

-- *** 서브쿼리는 SELECT, FROM, WHERE, HAVING, ORDER BY절에도 사용할 수 있다.


-- 5. 부서별 최고 급여를 받는 직원의 이름, 직급코드, 부서코드, 급여 조회하세요.
select
		e.emp_name,
        e.dept_code,
        e.job_code,
        e.salary
        from employee e
join (
		select
				dept_code,
                max(salary) as max_salary
		from employee
        group by dept_code
) t on e.dept_code = t.dept_code and e.salary = t.max_salary;



-- *** 여기서부터 난이도 극상

-- 6. 관리자에 해당하는 직원에 대한 정보와 관리자가 아닌 직원의 정보를 추출하여 조회하세요.
-- 사번, 이름, 부서명, 직급, '관리자' AS 구분 / '직원' AS 구분
-- HINT!! is not null, union(혹은 then, else), distinct
select
		e.emp_id,
        e.emp_name,
        d.dept_title,
        j.job_name,
        '관리자' as 구분
        from employee e
        join department d on e.dept_code = d.dept_id
        join job j on e.job_code = j.job_code
        where e.manager_id is not null
        union
select
		e.emp_id,
        e.emp_name,
        dept_title,
        job_name,
        '직원' as 구분
        from employee e
        join department d on e.dept_code = d.dept_id
        join job j on e.job_code = j.job_code
        where e.manager_id is null;

-- 7. 자기 직급의 평균 급여를 받고 있는 직원의 사번, 이름, 직급코드, 급여를 조회하세요.
-- 단, 급여와 급여 평균은 만원단위로 계산하세요.
-- HINT!! round(컬럼명, -5)
select
		e.emp_id,
        e.emp_name,
        e.dept_code,
        round(salary, -5) as salary
        from employee e
        join (select
					job_code,
                    round(avg(salary), -5) as avg_salary
					from employee
					group by job_code)
	    t on e.job_code = t.job_code
	    where round(e.salary, -5) = t.avg_salary;

-- 8. 퇴사한 여직원과 같은 부서, 같은 직급에 해당하는 직원의 이름, 직급코드, 부서코드, 입사일을 조회하세요.
select
        e.emp_name,
        e.dept_code,
        e.job_code,
        e.hire_date
        from employee e
        join employee m on e.dept_code = m.dept_code
						and e.job_code = m.job_code
		where m.ent_yn = 'Y'
        and m.emp_no like '%-2%';

-- 9. 급여 평균 3위 안에 드는 부서의 부서 코드와 부서명, 평균급여를 조회하세요.
-- HINT!! limit
SELECT 
    d.dept_id as DEPT_CODE,
    d.DEPT_TITLE,
    AVG(e.SALARY) AS avg_salary
FROM EMPLOYEE e
JOIN DEPARTMENT d ON e.DEPT_CODE = d.DEPT_ID
GROUP BY d.DEPT_id
ORDER BY avg_salary DESC
LIMIT 3;

-- 10. 부서별 급여 합계가 전체 급여의 총 합의 20%보다 많은 부서의 부서명과, 부서별 급여 합계를 조회하세요.
WITH total_salary AS (
    SELECT SUM(SALARY) AS total_salary
    FROM EMPLOYEE
)
SELECT 
    d.DEPT_TITLE,
    SUM(e.SALARY) AS dept_salary_sum
FROM EMPLOYEE e
JOIN DEPARTMENT d ON e.DEPT_CODE = d.DEPT_ID
GROUP BY d.DEPT_ID
HAVING SUM(e.SALARY) > (SELECT 0.2 * total_salary FROM total_salary)
