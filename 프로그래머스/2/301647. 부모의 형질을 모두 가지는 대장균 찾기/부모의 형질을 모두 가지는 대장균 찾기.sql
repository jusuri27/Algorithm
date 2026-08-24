-- 코드를 작성해주세요
select a.id, a.GENOTYPE, b.GENOTYPE from ECOLI_DATA a join ECOLI_DATA b on a.parent_id = b.id where (A.GENOTYPE & B.GENOTYPE) = b.GENOTYPE order by a.id