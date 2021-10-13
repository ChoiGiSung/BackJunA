-- 코드를 입력하세요
SELECT *
from PLACES p
where p.host_id in (
             select host_id
             from PLACES
             group by HOST_ID
             having count(id) >= 2
)
order by p.id;

--
