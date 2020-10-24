package com.discount.calculator.model;

import com.discount.calculator.util.CustomerType;

public class OrderDetails {

    private Double purchaseAmount;
    private CustomerType customerType;

    public OrderDetails(Double purchaseAmount, CustomerType customerType) {
        this.purchaseAmount = purchaseAmount;
        this.customerType = customerType;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

}
