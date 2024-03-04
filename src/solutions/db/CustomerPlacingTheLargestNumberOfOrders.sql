-- SELECT customer_number FROM orders
-- WHERE order_number = (SELECT MAX(order_number) FROM orders)

SELECT customer_number FROM orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC LIMIT 1