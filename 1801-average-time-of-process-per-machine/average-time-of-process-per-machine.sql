select machine_id,
       round(avg(b.timestamp - a.timestamp),3) as processing_time
from activity a
join activity b
using (machine_id, process_id)
where a.activity_type = 'start'
and b.activity_type = 'end'
group by machine_id;