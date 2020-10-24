package com.discount.calculator.service.impl;

import com.discount.calculator.model.OrderDetails;

public interface FinalBillService {

    Double calculateFinalBillAmount(OrderDetails orderDetails);
}
