package com.discount.calculator.service.impl;

import com.discount.calculator.metadata.DiscountMetaData;
import com.discount.calculator.model.OrderDetails;
import com.discount.calculator.service.DiscountMetaDataService;
import com.discount.calculator.util.CustomerType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DiscountMetaDataServiceImpl implements DiscountMetaDataService {

    public List<DiscountMetaData> getDiscountMetaData(OrderDetails orderDetails) {

        List<DiscountMetaData> discountMetaDataList = new ArrayList();
        constructRegularCustomerDataSet(discountMetaDataList);
        constructPremiumCustomerDataSet(discountMetaDataList);

        return discountMetaDataList.stream().filter(discountMetaData -> discountMetaData.getCustomerType()
                .equals(orderDetails.getCustomerType())).collect(Collectors.toList()).stream().filter(discountMetaData ->
                discountMetaData.getLowerRangeAmount() <= orderDetails.getPurchaseAmount()).collect(Collectors.toList());


    }

    private static void constructRegularCustomerDataSet(List<DiscountMetaData> discountMetaDataList) {

        DiscountMetaData discountMetaDataSlabOne = new DiscountMetaData();
        discountMetaDataSlabOne.setId(1L);
        discountMetaDataSlabOne.setCustomerType(CustomerType.REGULAR);
        discountMetaDataSlabOne.setLowerRangeAmount(0.00);
        discountMetaDataSlabOne.setUpperRangeAmount(5000.00);
        discountMetaDataSlabOne.setDiscountPercentage(0.00);

        DiscountMetaData discountMetaDataSlabTwo = new DiscountMetaData();
        discountMetaDataSlabTwo.setId(2L);
        discountMetaDataSlabTwo.setCustomerType(CustomerType.REGULAR);
        discountMetaDataSlabTwo.setLowerRangeAmount(5000.01);
        discountMetaDataSlabTwo.setUpperRangeAmount(10000.00);
        discountMetaDataSlabTwo.setDiscountPercentage(10.00);

        DiscountMetaData discountMetaDataSlabThree = new DiscountMetaData();
        discountMetaDataSlabThree.setId(3L);
        discountMetaDataSlabThree.setCustomerType(CustomerType.REGULAR);
        discountMetaDataSlabThree.setLowerRangeAmount(10000.01);
        discountMetaDataSlabThree.setUpperRangeAmount(null);
        discountMetaDataSlabThree.setDiscountPercentage(20.00);


        discountMetaDataList.add(discountMetaDataSlabOne);
        discountMetaDataList.add(discountMetaDataSlabTwo);
        discountMetaDataList.add(discountMetaDataSlabThree);


    }

    private static void constructPremiumCustomerDataSet(List<DiscountMetaData> discountMetaDataList) {

        DiscountMetaData discountMetaDataSlabOne = new DiscountMetaData();
        discountMetaDataSlabOne.setId(1L);
        discountMetaDataSlabOne.setCustomerType(CustomerType.PREMIUM);
        discountMetaDataSlabOne.setLowerRangeAmount(0.00);
        discountMetaDataSlabOne.setUpperRangeAmount(4000.00);
        discountMetaDataSlabOne.setDiscountPercentage(10.00);

        DiscountMetaData discountMetaDataSlabTwo = new DiscountMetaData();
        discountMetaDataSlabTwo.setId(2L);
        discountMetaDataSlabTwo.setCustomerType(CustomerType.PREMIUM);
        discountMetaDataSlabTwo.setLowerRangeAmount(4000.01);
        discountMetaDataSlabTwo.setUpperRangeAmount(8000.00);
        discountMetaDataSlabTwo.setDiscountPercentage(15.00);

        DiscountMetaData discountMetaDataSlabThree = new DiscountMetaData();
        discountMetaDataSlabThree.setId(3L);
        discountMetaDataSlabThree.setCustomerType(CustomerType.PREMIUM);
        discountMetaDataSlabThree.setLowerRangeAmount(8000.01);
        discountMetaDataSlabThree.setUpperRangeAmount(12000.00);
        discountMetaDataSlabThree.setDiscountPercentage(20.00);

        DiscountMetaData discountMetaDataSlabFour = new DiscountMetaData();
        discountMetaDataSlabFour.setId(4L);
        discountMetaDataSlabFour.setCustomerType(CustomerType.PREMIUM);
        discountMetaDataSlabFour.setLowerRangeAmount(12000.01);
        discountMetaDataSlabFour.setUpperRangeAmount(null);
        discountMetaDataSlabFour.setDiscountPercentage(30.00);


        discountMetaDataList.add(discountMetaDataSlabOne);
        discountMetaDataList.add(discountMetaDataSlabTwo);
        discountMetaDataList.add(discountMetaDataSlabThree);
        discountMetaDataList.add(discountMetaDataSlabFour);


    }
}
