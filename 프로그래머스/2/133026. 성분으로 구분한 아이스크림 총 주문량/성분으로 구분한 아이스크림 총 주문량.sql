-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(TOTAL_ORDER) from ICECREAM_INFO a left join FIRST_HALF b on a.FLAVOR = b.FLAVOR group by INGREDIENT_TYPE order by sum(TOTAL_ORDER)
# select * from FIRST_HALF