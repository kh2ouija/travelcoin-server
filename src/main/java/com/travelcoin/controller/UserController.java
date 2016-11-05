package com.travelcoin.controller;

import com.travelcoin.dto.Claim;
import com.travelcoin.dto.UserLogin;
import com.travelcoin.model.Asset;
import com.travelcoin.model.Provider;
import com.travelcoin.model.User;
import com.travelcoin.repository.ProviderRepository;
import com.travelcoin.repository.UserRepository;
import com.travelcoin.service.ProviderClient;
import com.travelcoin.service.ProviderClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private ProviderClientFactory providerClientFactory;

    @RequestMapping(method = RequestMethod.POST, path = "/authenticate")
    public User authenticate(UserLogin userLogin) {
        return userRepository.findByEmail(userLogin.getEmail());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/providers")
    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    public void claim(Claim claim) {
        ProviderClient agent = providerClientFactory.get(claim.getProviderId());
        List<Asset> assets = agent.claimAssets(claim.getCustomerIdentifier());
    }

}
