package com.Borman.Quotes.models.enums;

public enum Category {

    Funny("Funny"),
    Love("Love"),
    Wise("Wise");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
