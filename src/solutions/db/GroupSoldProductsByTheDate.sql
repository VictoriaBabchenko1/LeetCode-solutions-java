SELECT sell_date, count(DISTINCT product) AS num_sold,
STRING_AGG(DISTINCT product, ',' ORDER BY product) AS products
FROM Activities
GROUP BY sell_date