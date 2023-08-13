package com.in28minutes.rest.webservices.currencyexchangeservice.repository;

import com.in28minutes.rest.webservices.currencyexchangeservice.bean.CurrencyEchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository  extends JpaRepository<CurrencyEchange,Long> {
    CurrencyEchange findByFromAndTo(String from , String to);
}
