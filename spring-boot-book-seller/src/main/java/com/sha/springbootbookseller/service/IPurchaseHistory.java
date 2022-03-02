package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.PurchaseHistory;
import com.sha.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistory {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId)    //2. yontem kullanicinin satin aldigi kitaplarini bulmak
    ;
}
