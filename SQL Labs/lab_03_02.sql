SELECT employee_id, last_name, salary, 
ROUND(((salary *0.155) + salary),0) "New Salary"
FROM EMPLOYEES;