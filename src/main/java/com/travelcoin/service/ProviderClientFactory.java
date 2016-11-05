package com.travelcoin.service;

import com.travelcoin.model.Provider;
import com.travelcoin.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderClientFactory {

    @Autowired
    private ProviderRepository providerRepository;

    public ProviderClient get(Long providerId) {
        Provider provider = providerRepository.getOne(providerId);
        return new ProviderClient(provider);
    }

}
