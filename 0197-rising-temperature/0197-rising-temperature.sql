SELECT w1.id 
FROM weather w1
JOIN weather w2
WHERE datediff(w1.recordDate,w2.recordDate) = 1 
AND w1.temperature > w2.temperature