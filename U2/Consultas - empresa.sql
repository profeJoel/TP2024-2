-- SELECT Simple
SELECT *
FROM departments;


SELECT ID, name
FROM departments;


SELECT name, ID
FROM departments;

SELECT *
FROM employees;

SELECT last_name AS Apellido, salary "Sueldo anual", 10*(salary + 1000) "Sueldo proyectado a 10 años"
FROM employees;


SELECT CONCAT(first_name, ' ', last_name) AS "Nombre Empleado", salary "Sueldo anual", 10*(salary + 1000) "Sueldo proyectado a 10 años"
FROM employees;

-- DISTINCT

SELECT departments_ID
FROM employees;

SELECT DISTINCT departments_ID
FROM employees;

-- ORDER BY

SELECT CONCAT(first_name, ' ', last_name) AS "Nombre Empleado", hire_date
FROM employees
ORDER BY hire_date DESC;

-- WHERE

SELECT CONCAT(first_name, ' ', last_name) AS "Nombre Empleado", hire_date
FROM employees
WHERE departments_ID = 2;

SELECT first_name, last_name
FROM employees
WHERE first_name = "Constanza";

-- empleados con apellidos que comienzan con letra O
SELECT first_name, last_name
FROM employees
WHERE last_name LIKE "O%";

-- empleados contratados antes del 2000
SELECT first_name, last_name, hire_date
FROM employees
WHERE hire_date < "2000-01-01";

-- Empleados que ganan entre 100000 y 300000
SELECT first_name, last_name, salary
FROM employees
WHERE salary BETWEEN 100000 AND 300000;

-- empleados que trabajan en logistica y produccion
SELECT first_name, last_name, departments_ID
FROM employees
WHERE departments_ID IN(4,6);

-- empleados que ganan más de 100000 y contratados en el 2024
SELECT first_name, last_name, hire_date, salary
FROM employees
WHERE salary >= 100000
	AND hire_date >= '2024-01-01';

-- empleados que trabajan en logistica y produccion
SELECT first_name, last_name, departments_ID
FROM employees
WHERE departments_ID = 4 
	OR departments_ID = 6;
    
-- Empleados que no trabajen en administración ni finanzas
-- empleados que trabajan en logistica y produccion
SELECT first_name, last_name, departments_ID
FROM employees
WHERE departments_ID NOT IN(1,2);


-- JOIN
-- Identificar a los empleados del departamento de Gerencia
SELECT employees.first_name, employees.last_name, departments.name
FROM employees, departments
WHERE employees.departments_ID = departments.ID
	AND departments.name = 'Gerencia';
    
-- Contar a los empleados por departamento
SELECT d.name, COUNT(e.ID)
FROM employees AS e, departments AS d
WHERE e.departments_ID = d.ID
GROUP BY d.name;




