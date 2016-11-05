package com.travelcoin.controller;

import com.travelcoin.dto.Claim;
import com.travelcoin.model.Asset;
import com.travelcoin.model.Provider;
import com.travelcoin.model.User;
import com.travelcoin.repository.AssetRepository;
import com.travelcoin.repository.AssetTypeRepository;
import com.travelcoin.repository.ProviderRepository;
import com.travelcoin.repository.UserRepository;
import com.travelcoin.service.AgentsFacade;
import com.travelcoin.service.SecurityService;
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
    private AssetRepository assetRepository;

    @Autowired
    private AssetTypeRepository assetTypeRepository;

    @Autowired
    private AgentsFacade agentsFacade;

    @Autowired
    private SecurityService securityService;

    @RequestMapping(method = RequestMethod.POST, path = "/authenticate")
    public User getUserDetails() {
        return securityService.getCurrentLoggedInUser();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/providers")
    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/claim")
    public List<Asset> claim(Claim claim) {
        User user = securityService.getCurrentLoggedInUser();
        List<Asset> assets = agentsFacade.claim(user, claim.getProviderId(), claim.getCustomerIdentifier());
        return assets;
    }

}
