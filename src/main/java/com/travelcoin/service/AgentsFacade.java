package com.travelcoin.service;

import com.google.common.collect.ImmutableList;
import com.travelcoin.model.Asset;
import com.travelcoin.model.AssetType;
import com.travelcoin.model.Provider;
import com.travelcoin.model.User;
import com.travelcoin.repository.AssetRepository;
import com.travelcoin.repository.AssetTypeRepository;
import com.travelcoin.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AgentsFacade {

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private AssetTypeRepository assetTypeRepository;

    @Autowired
    private AssetRepository assetRepository;

    @Autowired
    private SecurityService securityService;

    public List<Asset> claim(User user, Long providerId, String customerIdentifier) {
        Provider provider = providerRepository.getOne(providerId);
        List<AssetType> assetTypes = assetTypeRepository.findByProvider(provider);
        AssetType assetType = assetTypes.get(0);
        Asset asset = makeAsset(user, assetType);
        return ImmutableList.of(asset);
    }

    private Asset makeAsset(User user, AssetType assetType) {
        Asset asset = new Asset();
        asset.setAssetType(assetType);
        asset.setAmount(BigDecimal.valueOf(ThreadLocalRandom.current().nextInt(3, 8) * 40));
        asset.setUser(user);
        assetRepository.save(asset);
        return asset;
    }
}
