package com.currency.currencyConverter.services;

import com.currency.currencyConverter.models.currency;
import com.currency.currencyConverter.repository.currencyRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class currencyService {
    private currencyRepository cRepository;

    public currencyService(currencyRepository cRepository) {
        this.cRepository = cRepository;
    }
    public List<currency> getAllCurrencies() {
        List<currency> currencyList = this.cRepository.findAll();
        currencyList.sort(Comparator.comparing(currency::getName));
        return currencyList;
    }

}