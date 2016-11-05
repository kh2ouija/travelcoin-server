package com.travelcoin.model;

import java.util.List;

public class User {

    private Long id;
    private String name;
    private List<Asset> assets;

    public User(String name, List<Asset> assets) {
        this.name = name;
        this.assets = assets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
}
