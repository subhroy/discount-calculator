package com.discount.calculator.service;

import com.discount.calculator.metadata.DiscountMetaData;
import com.discount.calculator.model.OrderDetails;

import java.util.List;

public interface DiscountMetaDataService {
    List<DiscountMetaData> getDiscountMetaData(OrderDetails orderDetails);
}
