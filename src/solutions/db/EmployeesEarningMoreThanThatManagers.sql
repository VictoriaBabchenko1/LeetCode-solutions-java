SELECT e1.name as employee FROM Employee e2
JOIN employee e1 ON e1.managerID = e2.id
WHERE e1.salary > e2.salary