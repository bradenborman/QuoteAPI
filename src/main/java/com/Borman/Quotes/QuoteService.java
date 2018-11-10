package com.Borman.Quotes;

import com.Borman.Quotes.models.Author;
import com.Borman.Quotes.models.Quote;
import com.Borman.Quotes.models.enums.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    private Logger logger = LoggerFactory.getLogger(QuoteService.class);


    public Quote getQuote() {

        Quote quote = new Quote();
        Author author = new Author("Brent", "Theonen", "Software Developer");
        quote.setAuthor(author);
        quote.setValue("Lil Shit");
        quote.setCategory(Category.Funny);
        logger.info("Returning quote: \"" + quote.getValue() + "\" -" + quote.getAuthor().getFullName());

        return quote;
    }
}
