SELECT employee_id,last_name, salary
FROM Employees
WHERE department_id = ANY
                (SELECT department_id
                 FROM Employees
                 WHERE last_name LIKE '%u%')
AND salary > ANY
                (SELECT AVG(salary)
                 FROM Employees);
            