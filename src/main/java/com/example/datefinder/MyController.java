package com.example.datefinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String datefinder(){

        LocalDate obj=LocalDate.now();
        LocalDate after_100 = obj.plusDays( 100) ;
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        
        
        String strdate=after_100.format(f1);

        return strdate;

    }

}


