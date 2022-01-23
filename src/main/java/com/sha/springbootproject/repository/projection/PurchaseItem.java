package com.sha.springbootproject.repository.projection;

import java.time.LocalDateTime;
import com.sha.springbootproject.model.DeviceType;

public interface PurchaseItem {
    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
