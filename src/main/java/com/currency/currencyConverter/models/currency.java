package com.currency.currencyConverter.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("currency")
public class currency {
    @Id
    private String name;
    private double valueInUSD;

    public currency() {
    }

    public currency(String name, double valueInEuros) {
        this.name = name;
        this.valueInUSD = valueInUSD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValueInUSD() {
        return valueInUSD;
    }

    public void setValueInUSD(double valueInUSD) {
        this.valueInUSD = valueInUSD;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", valueInUSD=" + valueInUSD +
                '}';
    }
}
