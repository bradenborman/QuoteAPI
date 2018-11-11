package com.Borman.Quotes;

import com.Borman.Quotes.models.Author;
import com.Borman.Quotes.models.Quote;
import com.Borman.Quotes.models.enums.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {

    private Logger logger = LoggerFactory.getLogger(QuoteService.class);

    public List<Quote> getQuote() {
        return QuoteFactory.getAllQuotes();
    }
}
