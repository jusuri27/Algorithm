-- 코드를 작성해주세요
select ID, EMAIL, FIRST_NAME, LAST_NAME from DEVELOPER_INFOS where SKILL_1 in ('python') or SKILL_2 in ('python') or SKILL_3 in ('python') order by ID