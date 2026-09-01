-- 코드를 입력하세요
SELECT user_id, nickname, sum(price) as TOTAL_SALES from USED_GOODS_USER u join USED_GOODS_BOARD b on u.user_id = b.writer_id where STATUS = 'done' group by user_id having TOTAL_SALES >= 700000 order by TOTAL_SALES

# select WRITER_ID, sum(PRICE) from USED_GOODS_BOARD group by WRITER_ID having sum(price) >= 700000;