package com.agribzar.Deployment90166;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class HomeController 
{
    @GetMapping({"/", "/home", "/status"})
    public String getStatus()
    {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("9-04-2025");
        String formattedDate = currentDate.format(formatter);

        return "Application is up and Running on " + formattedDate;
    }
}
