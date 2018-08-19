SELECT job_id, MAX(salary) maximum, MIN(salary) minimum,
SUM(salary) sum, ROUND(AVG(salary),0) average
FROM EMPLOYEES
GROUP BY JOB_ID;