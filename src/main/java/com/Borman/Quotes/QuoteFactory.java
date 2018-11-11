package com.Borman.Quotes;

import com.Borman.Quotes.controllers.api;
import com.Borman.Quotes.models.Author;
import com.Borman.Quotes.models.Quote;
import com.Borman.Quotes.models.enums.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


class QuoteFactory {


     static List<Quote> getAllQuotes() {

        Author author = new Author("Brent", "Theonen", "Software Developer");
        Author author2 = new Author("Braden", "Borman", "Software Developer");


        List<Quote> allQuotes = new ArrayList<>();
        Quote quote = new Quote();

        quote.setAuthor(author);
        quote.setValue("Lil Shit");
        quote.setCategory(Category.Funny);
        allQuotes.add(quote);

        Quote quote2 = new Quote();
        quote2.setAuthor(author);
        quote2.setValue("Nice job, Idiot");
        quote2.setCategory(Category.Wise);
        allQuotes.add(quote2);

         Quote quote3 = new Quote();
         quote3.setAuthor(author);
         quote3.setValue("I love you, Taylor");
         quote3.setCategory(Category.Love);
         allQuotes.add(quote3);

         Quote quote4 = new Quote();
         quote4.setAuthor(author2);
         quote4.setValue("Something Braden would say here");
         quote4.setCategory(Category.Funny);
         allQuotes.add(quote4);


         return allQuotes;
    }

}
