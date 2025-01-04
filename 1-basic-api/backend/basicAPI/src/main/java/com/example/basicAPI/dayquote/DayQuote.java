package com.example.basicAPI.dayquote;

import org.springframework.stereotype.Service;

@Service
public class DayQuote {
    private String quote;
    private String date;

    public DayQuote() {
        this.quote = "have a heavenly day";
        this.date = "today";
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
