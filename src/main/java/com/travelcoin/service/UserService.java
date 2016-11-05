package com.travelcoin.service;

import com.google.common.collect.ImmutableList;
import com.travelcoin.model.Asset;
import com.travelcoin.model.AssetType;
import com.travelcoin.model.Provider;
import com.travelcoin.model.User;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class UserService {

    public User getDefaultUser() {
        Provider accor = new Provider("Accor", "accor.api");
        AssetType accorPoints = new AssetType(accor, "points", BigDecimal.valueOf(0.8));
        Provider klm = new Provider("KLM", "klm.api");
        AssetType klmMiles = new AssetType(accor, "miles", BigDecimal.valueOf(0.2));
        User user = new User("Costin", ImmutableList.of(
                new Asset(accorPoints, BigDecimal.valueOf(120)),
                new Asset(klmMiles, BigDecimal.valueOf(400))
        ));

        return user;
    }

}
