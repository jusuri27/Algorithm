-- 코드를 입력하세요
SELECT 
    HISTORY_ID,
    CAR_ID,
    START_DATE,
    END_DATE,
case
    when datediff(END_DATE, START_DATE) + 1 >= 30 then '장기 대여'
    else '단기 대여'
end as RENT_TYPE
    
from
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
where
    START_DATE BETWEEN '2022-09-01' AND '2022-09-30'
order by
    history_id desc