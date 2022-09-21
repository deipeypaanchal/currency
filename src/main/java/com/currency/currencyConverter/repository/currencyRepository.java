package com.currency.currencyConverter.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class currencyRepository {
    public List<String> findAllCurrencies() {
        return Arrays.asList("USD", "EUR", "GBP");
    }
}
