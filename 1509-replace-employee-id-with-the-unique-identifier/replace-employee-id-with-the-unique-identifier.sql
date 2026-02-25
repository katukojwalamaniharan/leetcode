# Write your MySQL query statement below
select unique_id,name from Employees es left join EmployeeUNI eu on es.id = eu.id;