# Write your MySQL query statement below
SELECT DISTINCT s1.*
FROM stadium s1, stadium s2, stadium s3
WHERE s1.people >= 100
AND s2.people >= 100
AND s3.people >= 100
AND ((s2.id = s1.id + 1 AND s3.id = s1.id + 2)
OR (s2.id = s1.id - 1 AND s3.id = s1.id + 1)
OR (s2.id = s1.id - 1 AND s3.id = s1.id - 2))
ORDER BY s1.id;
