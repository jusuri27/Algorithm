-- 코드를 작성해주세요
select 
    # id, BIN(GENOTYPE), GENOTYPE, SUBSTRING(BIN(GENOTYPE), -4, 1)
    count(*)
from
    ECOLI_DATA 
where 
    (SUBSTRING(BIN(GENOTYPE), -3, 1) = 1 or SUBSTRING(BIN(GENOTYPE), -1, 1)) and SUBSTRING(BIN(GENOTYPE), -2, 1) != 1