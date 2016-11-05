package com.travelcoin.model;

import java.math.BigDecimal;

public class Asset {

    private Long id;
    private AssetType assetType;
    private BigDecimal amount;

    public Asset(AssetType assetType, BigDecimal amount) {
        this.assetType = assetType;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
