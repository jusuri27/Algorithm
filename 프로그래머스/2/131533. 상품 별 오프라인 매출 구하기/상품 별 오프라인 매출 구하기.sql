-- 코드를 입력하세요
SELECT product_code, sum(price * sales_amount) as SALES from offline_sale o left join product p on p.product_id = o.product_id group by p.product_code order by SALES desc, product_code