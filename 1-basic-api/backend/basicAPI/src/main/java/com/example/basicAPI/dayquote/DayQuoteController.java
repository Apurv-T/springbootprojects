package com.example.basicAPI.dayquote;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DayQuoteController {
    DayQuote  dq=new DayQuote();
    @GetMapping("getquote")
    public String getDayQuote(){
        return dq.getQuote();
    }

    @GetMapping("getday")
    public  String getDay(){
        return dq.getDate();
    }

}
