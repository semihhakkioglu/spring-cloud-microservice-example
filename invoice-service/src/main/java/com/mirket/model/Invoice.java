package com.mirket.model;

import com.mirket.client.model.Merchant;

import java.math.BigDecimal;

public class Invoice {

    private Merchant merchant;
    private BigDecimal amount;
    private String currency;

    public Invoice() {
    }

    public Invoice(Merchant merchant, BigDecimal amount, String currency) {
        this.merchant = merchant;
        this.amount = amount;
        this.currency = currency;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
