package com.currency.currencyConverter.repository;

import com.currency.currencyConverter.models.currency;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface currencyRepository extends CrudRepository<currency, String> {
    @Override
    List<currency> findAll();
}
