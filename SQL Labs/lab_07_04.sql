SELECT a.last_name, a.department_id, a.job_id
FROM Employees a
JOIN Departments b ON (a.department_id = b.department_id)
WHERE location_id = ANY
                    (SELECT location_id
                     FROM Departments
                     WHERE location_id = '&location_id');
