package com.discount.calculator.metadata;

import com.discount.calculator.util.CustomerType;

public class DiscountMetaData {
    private Long id;
    private CustomerType customerType;
    private Double lowerRangeAmount;
    private Double upperRangeAmount;
    private Double discountPercentage;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Double getLowerRangeAmount() {
        return lowerRangeAmount;
    }

    public void setLowerRangeAmount(Double lowerRangeAmount) {
        this.lowerRangeAmount = lowerRangeAmount;
    }

    public Double getUpperRangeAmount() {
        return upperRangeAmount;
    }

    public void setUpperRangeAmount(Double upperRangeAmount) {
        this.upperRangeAmount = upperRangeAmount;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

}
