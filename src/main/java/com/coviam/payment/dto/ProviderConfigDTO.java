package com.coviam.payment.dto;

import com.coviam.payment.entity.enums.ProviderStatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by avinashkumar on 06/02/2018 AD.
 */
public class ProviderConfigDTO implements Serializable {

    private String id;
    private String providerName;
    private String providerUrl;
    private String providerCallbackUrl;
    private String providerCredentialKey1;
    private String providerCredentialKey2;
    private String providerStatusDTO = ProviderStatus.ACTIVE.toString();
    private List<BusinessConfigDTO> businessConfigDetailsDTO = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderUrl() {
        return providerUrl;
    }

    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }

    public String getProviderCallbackUrl() {
        return providerCallbackUrl;
    }

    public void setProviderCallbackUrl(String providerCallbackUrl) {
        this.providerCallbackUrl = providerCallbackUrl;
    }

    public String getProviderCredentialKey1() {
        return providerCredentialKey1;
    }

    public void setProviderCredentialKey1(String providerCredentialKey1) {
        this.providerCredentialKey1 = providerCredentialKey1;
    }

    public String getProviderCredentialKey2() {
        return providerCredentialKey2;
    }

    public void setProviderCredentialKey2(String providerCredentialKey2) {
        this.providerCredentialKey2 = providerCredentialKey2;
    }

    public String getProviderStatusDTO() {
        return providerStatusDTO;
    }

    public void setProviderStatusDTO(String providerStatusDTO) {
        this.providerStatusDTO = providerStatusDTO;
    }

    public List<BusinessConfigDTO> getBusinessConfigDetailsDTO() {
        return businessConfigDetailsDTO;
    }

    public void setBusinessConfigDetailsDTO(List<BusinessConfigDTO> businessConfigDetailsDTO) {
        this.businessConfigDetailsDTO = businessConfigDetailsDTO;
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProviderConfigDTO that = (ProviderConfigDTO) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (providerName != null ? !providerName.equals(that.providerName) : that.providerName != null) return false;
        if (providerUrl != null ? !providerUrl.equals(that.providerUrl) : that.providerUrl != null) return false;
        if (providerCallbackUrl != null ? !providerCallbackUrl.equals(that.providerCallbackUrl) : that.providerCallbackUrl != null)
            return false;
        if (providerCredentialKey1 != null ? !providerCredentialKey1.equals(that.providerCredentialKey1) : that.providerCredentialKey1 != null)
            return false;
        if (providerCredentialKey2 != null ? !providerCredentialKey2.equals(that.providerCredentialKey2) : that.providerCredentialKey2 != null)
            return false;
        if (providerStatusDTO != null ? !providerStatusDTO.equals(that.providerStatusDTO) : that.providerStatusDTO != null)
            return false;
        return businessConfigDetailsDTO != null ? businessConfigDetailsDTO.equals(that.businessConfigDetailsDTO) : that.businessConfigDetailsDTO == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (providerName != null ? providerName.hashCode() : 0);
        result = 31 * result + (providerUrl != null ? providerUrl.hashCode() : 0);
        result = 31 * result + (providerCallbackUrl != null ? providerCallbackUrl.hashCode() : 0);
        result = 31 * result + (providerCredentialKey1 != null ? providerCredentialKey1.hashCode() : 0);
        result = 31 * result + (providerCredentialKey2 != null ? providerCredentialKey2.hashCode() : 0);
        result = 31 * result + (providerStatusDTO != null ? providerStatusDTO.hashCode() : 0);
        result = 31 * result + (businessConfigDetailsDTO != null ? businessConfigDetailsDTO.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProviderConfigDTO{" +
                "id='" + id + '\'' +
                ", providerName='" + providerName + '\'' +
                ", providerUrl='" + providerUrl + '\'' +
                ", providerCallbackUrl='" + providerCallbackUrl + '\'' +
                ", providerCredentialKey1='" + providerCredentialKey1 + '\'' +
                ", providerCredentialKey2='" + providerCredentialKey2 + '\'' +
                ", providerStatusDTO='" + providerStatusDTO + '\'' +
                ", businessConfigDetailsDTO=" + businessConfigDetailsDTO +
                '}';
    }
}
