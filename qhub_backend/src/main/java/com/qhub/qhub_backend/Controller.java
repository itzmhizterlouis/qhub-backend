package com.qhub.qhub_backend;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
@RequestMapping("api/v1/")
@AllArgsConstructor
public class Controller {

    private final Service service;

    @GetMapping("year-percentage")
    public YearPercentageResponse getYearPercentage() {

        return service.getYearPercentage();
    }
}
