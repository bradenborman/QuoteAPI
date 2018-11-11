package com.Borman.Quotes.controllers;

import com.Borman.Quotes.QuoteService;
import com.Borman.Quotes.models.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class api {

    Logger logger = LoggerFactory.getLogger(api.class);

    @Autowired
    private QuoteService quoteService;

    @RequestMapping("/quotes")
    public List<Quote> getQuote() {
        logger.info("Endpoint hit: \"/api/quote\"");
        return quoteService.getQuote();
    }




}
