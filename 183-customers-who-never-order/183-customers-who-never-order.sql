# Write your MySQL query statement below
SELECT c.name AS Customers FROM Customers AS c LEFT JOIN Orders ON Orders.customerId = c.id WHERE customerId IS NULL;