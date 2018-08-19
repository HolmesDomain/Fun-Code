SELECT last_name "Employee", SALARY "Monthly Salary"
  FROM employees
  WHERE (salary BETWEEN 5000 AND 12000)
  AND (department_id LIKE 20 or department_id like 50);