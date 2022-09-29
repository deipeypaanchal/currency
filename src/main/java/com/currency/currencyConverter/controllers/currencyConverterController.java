package com.currency.currencyConverter.controllers;

import com.currency.currencyConverter.models.currency;
import com.currency.currencyConverter.services.currencyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class currencyConverterController {

    com.currency.currencyConverter.services.currencyService currencyService;

    public currencyConverterController(currencyService currencyService) {
        this.currencyService = currencyService;
    }

    // Lists all currencies
    @RequestMapping(value = "/currencies", produces = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<List<currency>> convertCurrency() {
        return new ResponseEntity<>(this.currencyService.getAllCurrencies(), HttpStatus.OK);
    }
}
