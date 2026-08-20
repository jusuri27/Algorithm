-- 코드를 작성해주세요
# select year(DIFFERENTIATION_DATE) from ECOLI_DATA
select year(DIFFERENTIATION_DATE) as year, (select max(SIZE_OF_COLONY) from ECOLI_DATA b where year(a.DIFFERENTIATION_DATE) = year(b.DIFFERENTIATION_DATE)) - SIZE_OF_COLONY as YEAR_DEV, id from ECOLI_DATA a order by year, YEAR_DEV 