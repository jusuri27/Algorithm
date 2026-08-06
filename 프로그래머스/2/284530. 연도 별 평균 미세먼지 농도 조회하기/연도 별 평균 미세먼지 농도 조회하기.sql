-- 코드를 작성해주세요
select year(ym), round(avg(PM_VAL1), 2), round(avg(PM_VAL2), 2) from AIR_POLLUTION where LOCATION2 = '수원'
group by year(ym)
order by year(ym)

