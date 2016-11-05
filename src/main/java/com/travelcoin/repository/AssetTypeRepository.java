package com.travelcoin.repository;

import com.travelcoin.model.AssetType;
import com.travelcoin.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetTypeRepository extends JpaRepository<AssetType, Long> {

    List<AssetType> findByProvider(Provider provider);
}
