package com.coviam.payment.dto;

import com.coviam.payment.entity.enums.PaymentStatus;

import java.io.Serializable;

/**
 * Created by avinashkumar on 06/02/2018 AD.
 */
public class TransactionDTO implements Serializable {

    private String id;
    private String superPnr;
    private Double amount;
    private String providerId;
    private String paymentMethod;
    private String paymentStatusDTO = PaymentStatus.PENDING.toString();
    private String customerId;
    private CardDetailsDTO cardDetailsDTO;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSuperPnr() {
        return superPnr;
    }

    public void setSuperPnr(String superPnr) {
        this.superPnr = superPnr;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatusDTO() {
        return paymentStatusDTO;
    }

    public void setPaymentStatusDTO(String paymentStatusDTO) {
        this.paymentStatusDTO = paymentStatusDTO;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CardDetailsDTO getCardDetailsDTO() {
        return cardDetailsDTO;
    }

    public void setCardDetailsDTO(CardDetailsDTO cardDetailsDTO) {
        this.cardDetailsDTO = cardDetailsDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransactionDTO that = (TransactionDTO) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (superPnr != null ? !superPnr.equals(that.superPnr) : that.superPnr != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (providerId != null ? !providerId.equals(that.providerId) : that.providerId != null) return false;
        if (paymentMethod != null ? !paymentMethod.equals(that.paymentMethod) : that.paymentMethod != null)
            return false;
        if (paymentStatusDTO != null ? !paymentStatusDTO.equals(that.paymentStatusDTO) : that.paymentStatusDTO != null)
            return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        return cardDetailsDTO != null ? cardDetailsDTO.equals(that.cardDetailsDTO) : that.cardDetailsDTO == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (superPnr != null ? superPnr.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (providerId != null ? providerId.hashCode() : 0);
        result = 31 * result + (paymentMethod != null ? paymentMethod.hashCode() : 0);
        result = 31 * result + (paymentStatusDTO != null ? paymentStatusDTO.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (cardDetailsDTO != null ? cardDetailsDTO.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "id='" + id + '\'' +
                ", superPnr='" + superPnr + '\'' +
                ", amount=" + amount +
                ", providerId='" + providerId + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatusDTO='" + paymentStatusDTO + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardDetailsDTO=" + cardDetailsDTO +
                '}';
    }
}
