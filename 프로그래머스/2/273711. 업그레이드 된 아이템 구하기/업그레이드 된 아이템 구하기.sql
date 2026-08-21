-- 코드를 작성해주세요
select I.ITEM_ID, ITEM_NAME, RARITY from ITEM_INFO i join item_tree t on i.item_id = t.item_id 
where PARENT_ITEM_ID in (select item_id from item_info where rarity = 'rare') order by i.item_id desc