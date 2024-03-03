-- SELECT stock_name, SUM(
--     CASE
--        WHEN operation = 'Buy' THEN -price
--        ELSE price
--     END)
-- AS capital_gain_loss FROM Stocks
-- GROUP BY stock_name

SELECT stock_name,
       SUM(price) FILTER ( WHERE  operation = 'Sell') - SUM(price) FILTER ( WHERE  operation = 'Buy') AS capital_gain_loss
FROM Stocks
GROUP BY stock_name