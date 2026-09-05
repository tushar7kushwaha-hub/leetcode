# Write your MySQL query statement below
select email as 'Email' from Person Group by Email having Count(email) > 1;