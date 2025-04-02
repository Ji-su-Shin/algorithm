-- 조건에 맞는 개발자 찾기
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE BIN(SKILL_CODE & (
        SELECT CODE
        FROM SKILLCODES
        WHERE NAME = 'Python')) != 0
UNION
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE BIN(SKILL_CODE & (
        SELECT CODE
        FROM SKILLCODES
        WHERE NAME = 'C#')) != 0
ORDER BY ID
