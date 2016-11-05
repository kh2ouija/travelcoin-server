package com.travelcoin.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<Asset> assets;

    private String name;
    private String email;

    @Transient
    public BigDecimal totalAssetsValue() {
        return assets.stream().map(Asset::getValue).reduce(BigDecimal::add).get();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
