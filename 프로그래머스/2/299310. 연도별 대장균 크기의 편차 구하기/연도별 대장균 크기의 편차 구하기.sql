select year(e.differentiation_date) as year, m.max_size - e.size_of_colony as year_dev, e.id
from ecoli_data e 
inner join (
select year(differentiation_date) as year, max(size_of_colony) as max_size
from ecoli_data
    group by year(differentiation_date)
) m on year(e.differentiation_date) = m.year
order by year asc, year_dev asc;