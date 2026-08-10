-- 코드를 작성해주세요
select 
    sum(SCORE), e.EMP_NO, EMP_NAME, POSITION, EMAIL
from 
    HR_EMPLOYEES e 
join HR_DEPARTMENT d on e.dept_id = d.dept_id
join HR_GRADE g on e.emp_no = g.emp_no
group by e.EMP_NO
order by sum(SCORE) desc
limit 1

# select * from HR_GRADE