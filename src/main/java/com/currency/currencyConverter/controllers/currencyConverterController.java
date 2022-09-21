package com.currency.currencyConverter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.currency.currencyConverter.services.currencyService;

@RestController
public class currencyConverterController {

    @Autowired
    currencyService cService;

    @RequestMapping("/currencies")
    public String getCurrencies() {
        return cService.getCurrencyString();
    }

}