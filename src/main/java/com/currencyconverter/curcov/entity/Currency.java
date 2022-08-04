package com.currencyconverter.curcov.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "currency_cov")
public class Currency {
    @Id
    @Column(name = "country_cur")
    private String fCountry;

    @Column(name = "value")
    private Double value;




}
