package com.in28minutes.rest.webservices.currencyexchangeservice.controller;

import com.in28minutes.rest.webservices.currencyexchangeservice.bean.CurrencyEchange;
import com.in28minutes.rest.webservices.currencyexchangeservice.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;
    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyEchange retrieveExchangeValue(@PathVariable String from , @PathVariable String to){
        String port = environment.getProperty("local.server.port");
        CurrencyEchange currencyEchange = currencyExchangeRepository.findByFromAndTo(from, to);
        if(currencyEchange==null)
            throw new RuntimeException("Unable To find data from "+from+" to "+to);
        currencyEchange.setPort(port);
        return currencyEchange;
    }
}
