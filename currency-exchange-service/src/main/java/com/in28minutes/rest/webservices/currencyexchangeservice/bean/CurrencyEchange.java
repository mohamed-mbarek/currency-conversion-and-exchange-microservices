package com.in28minutes.rest.webservices.currencyexchangeservice.bean;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class CurrencyEchange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "currency_from")
    private String from ;
    @Column(name = "currency_to")
    private String to;
    private BigDecimal conversionMultiple;
    private String port;

    public CurrencyEchange(Long id, String from, String to, BigDecimal conversionMultiple, String port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.port=port;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public CurrencyEchange() {
    }
}
