-- 코드를 작성해주세요
select count(*), n.fish_name from FISH_INFO i join fish_name_info n on i.fish_type = n.fish_type group by i.fish_type order by count(*) desc