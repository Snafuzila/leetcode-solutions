# Write your MySQL query statement below
SELECT DISTINCT l1.num AS ConsecutiveNums 
FROM Logs l1
JOIN logs l2 ON l1.id = l2.id-1
JOIN logs l3 on l1.id = l3.id-2
WHERE l1.num = l2.num AND  l2.num= l3.num