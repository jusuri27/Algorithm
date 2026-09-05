-- 코드를 입력하세요
# 자동차 종류가 '세단'인 자동차들 중
# 10월에 대여를 시작한 기록이 있는 자동차 ID 리스트를 출력하는 SQL문을 작성
# 자동차 ID 리스트는 중복이 없어야 하며,
# 자동차 ID를 기준으로 내림차순 정렬해주세요.

SELECT distinct(i.CAR_ID) from CAR_RENTAL_COMPANY_CAR i join CAR_RENTAL_COMPANY_RENTAL_HISTORY h on i.car_id = h.car_id where month(START_DATE) = '10' and i.car_type = '세단' order by i.car_id desc

# SELECT car_id, count(*) from CAR_RENTAL_COMPANY_RENTAL_HISTORY group by car_id
# SELECT * from CAR_RENTAL_COMPANY_RENTAL_HISTORY  ;