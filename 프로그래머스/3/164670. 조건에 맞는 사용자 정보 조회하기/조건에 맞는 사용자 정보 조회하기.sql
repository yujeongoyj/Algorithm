# -- 보드 아이디를 3개 이상 가지고 있는 유저 출력
# SELECT  U.USER_ID, U.NICKNAME, 
#         CONCAT(U.CITY, ' ', U.STREET_ADDRESS1, U.STREET_ADDRESS2) AS '전체주소',
#         CONCAT(SUBSTRING(U.TLNO, 1, 3), '-', SUBSTRING(U.TLNO, 4, 4), '-', SUBSTRING(U.TLNO, 8, 4)) AS '전화번호'
# FROM USED_GOODS_USER U
# INNER JOIN (SELECT
#            WRITER_ID
#            FROM USED_GOODS_BOARD
#            GROUP BY WRITER_ID
#            HAVING COUNT(BOARD_ID) >= 3) A
# ON U.USER_ID = A.WRITER_ID
# ORDER BY U.USER_ID DESC;

SELECT  USER_ID
        , NICKNAME
        , CONCAT(CITY, ' ', STREET_ADDRESS1, ' ', STREET_ADDRESS2) AS '전체주소'
        , CONCAT(SUBSTR(TLNO, 1, 3), '-', SUBSTR(TLNO, 4, 4), '-', SUBSTR(TLNO, 8)) AS '전화번호'
FROM    USED_GOODS_USER 
WHERE   USER_ID IN (
                     SELECT  WRITER_ID
                     FROM    USED_GOODS_BOARD
                     GROUP BY WRITER_ID
                     HAVING  COUNT(*) >= 3
                 )
 ORDER 
    BY  USER_ID DESC;


