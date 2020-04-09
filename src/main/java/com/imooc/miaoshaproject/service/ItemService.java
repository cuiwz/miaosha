package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.error.BusinessException;
import com.imooc.miaoshaproject.service.model.ItemModel;

import java.util.List;

public interface ItemService {

    /**
     * 创建商品
     * @param itemModel
     * @return
     * @throws BusinessException
     */
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    /**
     * 商品列表浏览
     * @return
     */
    List<ItemModel> listItem();

    /**
     * 商品详情浏览
     * @param id
     * @return
     */
    ItemModel getItemById(Integer id);

    /**
     * 通过缓存获取ItemModel
     * 验证item及promo model是否有效
     * @param id
     * @return
     */
    ItemModel getItemByIdInCache(Integer id);

    /**
     * 库存扣减
     * @param itemId
     * @param amount
     * @return
     * @throws BusinessException
     */
    boolean decreaseStock(Integer itemId,Integer amount)throws BusinessException;

    /**
     * 商品销量增加
     * @param itemId
     * @param amount
     * @throws BusinessException
     */
    void increaseSales(Integer itemId,Integer amount)throws BusinessException;

}
