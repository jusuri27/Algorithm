-- 코드를 입력하세요
SELECT
    count(*)
from
    user_info
where
    age >= 20 and age <= 29 and
    DATE_FORMAT(JOINED, '%Y') = 2021;