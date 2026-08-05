-- 코드를 작성해주세요
select count(*), month(TIME) from FISH_INFO group by month(TIME) order by month(TIME)