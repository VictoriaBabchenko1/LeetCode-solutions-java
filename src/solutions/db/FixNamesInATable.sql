SELECT
    user_id,
    UPPER(LEFT(name,1)) || SUBSTRING(LOWER(name),2) AS name
FROM Users
ORDER BY user_id

-- SELECT user_id, INITCAP(name) AS name FROM Users
-- ORDER BY user_id
