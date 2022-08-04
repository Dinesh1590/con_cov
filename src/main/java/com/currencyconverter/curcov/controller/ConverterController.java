package com.currencyconverter.curcov.controller;

import com.currencyconverter.curcov.model.CurrencyDTO;
import com.currencyconverter.curcov.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class ConverterController {
    @Autowired
    private CurrencyService currencyService;

    @PostMapping("/currency_converter")
    public ResponseEntity<Double> processForgotPassword(@RequestBody CurrencyDTO currency) {

        double status = currencyService.currencyConverter(currency);

        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @GetMapping("/country/list")
    public List<String> showForgotPasswordForm() {
        return currencyService.countryList();
    }


}
