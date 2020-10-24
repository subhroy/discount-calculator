package com.discount.calculator.service.impl;

import com.discount.calculator.model.OrderDetails;


import java.util.Objects;

public class FinalBillServiceImpl implements FinalBillService {

    Double finalDiscountAmount = 0.00;
    Double finalBillAmount = 0.00;

    public Double calculateFinalBillAmount(OrderDetails orderDetails) {

        DiscountMetaDataServiceImpl discountMetaDataServiceImpl = new DiscountMetaDataServiceImpl();
        discountMetaDataServiceImpl.getDiscountMetaData(orderDetails).forEach(
                discountMetaDataCal -> {

                    Double discountAmount = 0.00;

                    if (discountMetaDataCal.getDiscountPercentage() > 0.00) {
                        if (Objects.nonNull(discountMetaDataCal.getUpperRangeAmount()) && orderDetails.getPurchaseAmount() > discountMetaDataCal.getUpperRangeAmount()) {
                            discountAmount = (discountMetaDataCal.getUpperRangeAmount() - discountMetaDataCal.getLowerRangeAmount()) * discountMetaDataCal.getDiscountPercentage()
                                    / 100.00;
                            finalDiscountAmount = finalDiscountAmount + discountAmount;
                        } else {
                            discountAmount = (orderDetails.getPurchaseAmount() - discountMetaDataCal.getLowerRangeAmount()) * discountMetaDataCal.getDiscountPercentage()
                                    / 100.00;
                            finalDiscountAmount = finalDiscountAmount + discountAmount;
                        }

                    }
                }
        );
        finalBillAmount = orderDetails.getPurchaseAmount() - finalDiscountAmount;
        return finalBillAmount;

    }
}
