-- 코드를 입력하세요
SELECT USER_ID, NICKNAME, concat(CITY, ' ', STREET_ADDRESS1, ' ', STREET_ADDRESS2), CONCAT(
    SUBSTRING(TLNO, 1, 3), '-',
    SUBSTRING(TLNO, 4, 4), '-',
    SUBSTRING(TLNO, 8, 4)
) from USED_GOODS_USER u join USED_GOODS_BOARD b on u.user_id = b.writer_id group by u.nickname having count(nickname) >= 3 order by user_id desc