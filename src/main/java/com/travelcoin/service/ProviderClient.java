package com.travelcoin.service;

import com.travelcoin.model.Asset;
import com.travelcoin.model.Provider;

import java.util.Collections;
import java.util.List;

public class ProviderClient {

    private Provider provider;

    public ProviderClient(Provider provider) {
        this.provider = provider;
    }

    public List<Asset> claimAssets(String customerIdentifier) {
        // REST call to agent deployed on actor premises
        return Collections.emptyList();
    }
}
