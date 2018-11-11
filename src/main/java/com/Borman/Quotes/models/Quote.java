package com.Borman.Quotes.models;

import com.Borman.Quotes.models.enums.Category;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "author", "value", "category"})
public class Quote {

    private String value;
    private Author author;
    private Category category;

    public String getCategory() {
        return category.getValue();
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
