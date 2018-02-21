package com.coviam.payment.dto;

import com.coviam.payment.entity.enums.ProviderStatus;

import java.io.Serializable;

/**
 * Created by avinashkumar on 06/02/2018 AD.
 */
public class BusinessConfigDTO implements Serializable {

    private String id;
    private String busniessId;
    private String maxAmount;
    private String minAmount;
    private String busniessStatus = ProviderStatus.ACTIVE.toString();
    private ProviderConfigDTO providerConfigDTO;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusniessId() {
        return busniessId;
    }

    public void setBusniessId(String busniessId) {
        this.busniessId = busniessId;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public String getBusniessStatus() {
        return busniessStatus;
    }

    public void setBusniessStatus(String busniessStatus) {
        this.busniessStatus = busniessStatus;
    }

    public ProviderConfigDTO getProviderConfigDTO() {
        return providerConfigDTO;
    }

    public void setProviderConfigDTO(ProviderConfigDTO providerConfigDTO) {
        this.providerConfigDTO = providerConfigDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessConfigDTO that = (BusinessConfigDTO) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (busniessId != null ? !busniessId.equals(that.busniessId) : that.busniessId != null) return false;
        if (maxAmount != null ? !maxAmount.equals(that.maxAmount) : that.maxAmount != null) return false;
        if (minAmount != null ? !minAmount.equals(that.minAmount) : that.minAmount != null) return false;
        if (busniessStatus != null ? !busniessStatus.equals(that.busniessStatus) : that.busniessStatus != null)
            return false;
        return providerConfigDTO != null ? providerConfigDTO.equals(that.providerConfigDTO) : that.providerConfigDTO == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (busniessId != null ? busniessId.hashCode() : 0);
        result = 31 * result + (maxAmount != null ? maxAmount.hashCode() : 0);
        result = 31 * result + (minAmount != null ? minAmount.hashCode() : 0);
        result = 31 * result + (busniessStatus != null ? busniessStatus.hashCode() : 0);
        result = 31 * result + (providerConfigDTO != null ? providerConfigDTO.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BusinessConfigDTO{" +
                "id='" + id + '\'' +
                ", busniessId='" + busniessId + '\'' +
                ", maxAmount='" + maxAmount + '\'' +
                ", minAmount='" + minAmount + '\'' +
                ", busniessStatus='" + busniessStatus + '\'' +
                ", providerConfigDTO=" + providerConfigDTO +
                '}';
    }
}
