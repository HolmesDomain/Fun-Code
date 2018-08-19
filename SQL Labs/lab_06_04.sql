SELECT last_name Employee,employee_id EMP#,manager_ID Mgr#
FROM Employees
WHERE manager_id IS NOT NULL;