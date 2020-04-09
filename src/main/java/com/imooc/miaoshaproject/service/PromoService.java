package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.service.model.PromoModel;

public interface PromoService {
    /**
     * 根据itemid获取即将进行的或正在进行的秒杀活动
     * @param itemId
     * @return
     */
    PromoModel getPromoByItemId(Integer itemId);

    /**
     * 活动发布
     * @param promoId
     */
    void publishPromo(Integer promoId);
}
