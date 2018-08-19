SELECT employee_id,last_name
FROM Employees
WHERE department_id = ANY
                (SELECT department_id
                 FROM Employees
                 WHERE last_name LIKE '%u%');