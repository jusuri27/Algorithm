-- 코드를 입력하세요
SELECT
    ANIMAL_ID,
    NAME,
    case
        when SEX_UPON_INTAKE like '%Neutered%' or SEX_UPON_INTAKE like '%Spayed%' then 'O'
        else 'X'
    end
from
    ANIMAL_INS 
