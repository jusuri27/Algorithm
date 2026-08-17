-- 코드를 작성해주세요
# select id, email, first_name, last_name from DEVELOPERS where SUBSTRING(BIN(SKILL_CODE), -9, 1) = '1' or SUBSTRING(BIN(SKILL_CODE), -11, 1) = '1' order by id
select distinct id, email, first_name, last_name from DEVELOPERS d join skillcodes s on d.skill_code & s.code where s.name in ('python', 'c#') order by id