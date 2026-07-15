-- 코드를 입력하세요
select sum(animal_count) as count from (SELECT count(name), name, 1 as animal_count from ANIMAL_INS where name is not null group by name) t