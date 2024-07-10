select user_id,CONCAT(
    UPPER(SUBSTRING(name,1,1)),
    LOWER(SUBSTRING(name,2,length(name))))
AS 'name' from Users ORDER BY user_id,name;
