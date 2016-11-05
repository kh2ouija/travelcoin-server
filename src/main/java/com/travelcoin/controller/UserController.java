package com.travelcoin.controller;

import com.travelcoin.dto.Claim;
import com.travelcoin.model.Asset;
import com.travelcoin.model.Product;
import com.travelcoin.model.Provider;
import com.travelcoin.model.User;
import com.travelcoin.repository.*;
import com.travelcoin.service.AgentsFacade;
import com.travelcoin.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/authenticate")
    public User getUserDetails() {
        return securityService.getCurrentLoggedInUser();
    }

    @GetMapping("/providers")
    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    @PostMapping("/claim")
    public List<Asset> claim(Claim claim) {
        User user = securityService.getCurrentLoggedInUser();
        List<Asset> assets = agentsFacade.claim(user, claim.getProviderId(), claim.getCustomerIdentifier());
        return assets;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
