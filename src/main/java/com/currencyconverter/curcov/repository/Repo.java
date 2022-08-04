package com.currencyconverter.curcov.repository;

import com.currencyconverter.curcov.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Currency, String> {
Currency findByfCountry(String str);

}

