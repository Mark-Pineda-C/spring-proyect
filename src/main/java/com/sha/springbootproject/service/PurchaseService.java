package com.sha.springbootproject.service;

import java.util.List;
import com.sha.springbootproject.model.Purchase;
import com.sha.springbootproject.repository.projection.PurchaseItem;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);
    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
