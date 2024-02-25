SELECT
    score,
    DENSE_RANK() OVER (
        ORDER BY score DESC
        ) rank
FROM Scores;

-- SELECT
--     score,
--     DENSE_RANK() OVER (ORDER BY score DESC) AS rank
-- FROM
--     Scores;