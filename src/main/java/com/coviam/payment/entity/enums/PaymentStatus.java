package com.coviam.payment.entity.enums;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Created by avinashkumar on 19/02/2018 AD.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public enum PaymentStatus implements Serializable {

    PENDING("pending"),
    SUCCESSFUL("successful"),
    DEFERRED("deferred"),
    CANCELLED("cancelled");

    private final String name;

    PaymentStatus(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
