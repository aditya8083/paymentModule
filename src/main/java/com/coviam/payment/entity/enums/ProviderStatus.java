package com.coviam.payment.entity.enums;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public enum ProviderStatus implements Serializable {
   ACTIVE("active"),
   INACTIVE("inactive");

   private final String name;

   ProviderStatus(String name) {
      this.name = name;
   }

   public String toString() {
      return this.name;
   }
}

