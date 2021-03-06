package com.alipay.global.api.model;

public class CardPaymentMethodDetail {

    private String    cardToken;
    private String    cardNo;
    private CardBrand brand;
    private String    cardIssuer;
    private String    countryIssue;
    private UserName  instUserName;
    private String    expiryYear;
    private String    expiryMonth;
    private Address   billingAddress;
    private String    mask;
    private String    last4;
    private String    paymentMethodDetailMetadata;

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public CardBrand getBrand() {
        return brand;
    }

    public void setBrand(CardBrand brand) {
        this.brand = brand;
    }

    public String getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(String cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    public String getCountryIssue() {
        return countryIssue;
    }

    public void setCountryIssue(String countryIssue) {
        this.countryIssue = countryIssue;
    }

    public UserName getInstUserName() {
        return instUserName;
    }

    public void setInstUserName(UserName instUserName) {
        this.instUserName = instUserName;
    }

    public String getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
    }

    public String getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public String getPaymentMethodDetailMetadata() {
        return paymentMethodDetailMetadata;
    }

    public void setPaymentMethodDetailMetadata(String paymentMethodDetailMetadata) {
        this.paymentMethodDetailMetadata = paymentMethodDetailMetadata;
    }
}
