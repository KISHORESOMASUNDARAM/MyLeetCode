select score,DENSE_RANK() OVER(order by score desc ) 'rank'
from Scores 
