package com.currency.currencyConverter.services;

import com.currency.currencyConverter.repository.currencyRepository;
import org.springframework.stereotype.Service;

@Service
public class currencyService {
    private currencyRepository cRepository;

    public currencyService(currencyRepository cRepository) {
        this.cRepository = cRepository;
    }
    public String getCurrencyString() {
        return cRepository.findAllCurrencies().get(0);
    }
}
