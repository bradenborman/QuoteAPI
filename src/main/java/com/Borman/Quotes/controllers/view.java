package com.Borman.Quotes.controllers;

import com.Borman.Quotes.models.Quote;
import org.springframework.web.bind.annotation.RequestMapping;

public class view {

    @RequestMapping("/")
    public String getHome() {
        return "index";
    }



}
