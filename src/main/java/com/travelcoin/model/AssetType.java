package com.travelcoin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class AssetType {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Provider provider;

    private String title;
    private String unitName;
    private BigDecimal conversionRate;

}
