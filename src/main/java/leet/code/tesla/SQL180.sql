-- 连续三天登陆
 select distinct num as ConsecutiveNums from ( select
        id,
        num,
        row_number() over(order by id) as rn,
        row_number() over(partition by num order by id) as id_rn
    from Logs) t0 group by num,(rn - id_rn)
    having count(*) >=3
