SELECT a.department_id Department,a.last_name
Employee, b.last_name colleague
FROM employees a
JOIN employees b ON (a.department_id = b.department_id)
WHERE a.employee_id <> b.employee_id
ORDER BY a.DEPARTMENT_ID, a.last_name;