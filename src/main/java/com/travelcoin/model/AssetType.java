package com.travelcoin.model;

import java.math.BigDecimal;

public class AssetType {

    private Long id;
    private String displayName;
    private Provider provider;
    private BigDecimal conversionRate;

    public AssetType(Provider provider, String displayName, BigDecimal conversionRate) {
        this.provider = provider;
        this.displayName = displayName;
        this.conversionRate = conversionRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }
}
