package com.currency.currencyConverter.tasks;

import com.currency.currencyConverter.models.currency;
import com.currency.currencyConverter.models.currencyDTO;
import com.currency.currencyConverter.repository.currencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class currencyTask {

    @Autowired
    private currencyRepository cRepository;

    // Runs every 5 hour
    @Scheduled(fixedRate = 5 * 1000 * 60 * 60)
    private void getRatesTask() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            currencyDTO forObject = restTemplate.getForObject("http://data.fixer.io/api/latest?access_key=0a5f28039a528338c606d27c78c40e3b", currencyDTO.class);
            forObject.getRates().forEach((key, value) -> {
                currency currency1 = new currency(key, value);
                this.cRepository.save(currency1);
            });
        } catch (RestClientException ex) {
            System.out.println(ex.getMessage());
        }
    }
}