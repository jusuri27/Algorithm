-- 코드를 입력하세요
SELECT CATEGORY, sum(sales) from BOOK a join BOOK_SALES b on a.book_id = b.book_id where month(sales_date) = '1' group by category order by category

# select book_id, count(*), min(sales), max(sales), sum(sales) from book_sales where month(SALES_DATE) = '1' group by book_id