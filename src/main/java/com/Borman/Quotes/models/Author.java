package com.Borman.Quotes.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Author {

    private String firstName;
    private String LastName;
    private String occupation;

    public Author() { }

    public Author(String firstName, String lastName, String occupation) {
        this.firstName = firstName;
        LastName = lastName;
        this.occupation = occupation;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


    @JsonIgnore
    public String getFullName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }
}

