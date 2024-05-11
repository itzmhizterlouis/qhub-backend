package com.qhub.qhub_backend;


import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {

    public YearPercentageResponse getYearPercentage() {

        LocalDate currentDate = LocalDate.now();

        LocalDate startOfYear = LocalDate.of(currentDate.getYear(), 1, 1);
        LocalDate endOfYear = LocalDate.of(currentDate.getYear(), 12, 31);

        long daysPassed = ChronoUnit.DAYS.between(startOfYear, currentDate);

        long totalDaysInYear = ChronoUnit.DAYS.between(startOfYear, endOfYear) + 1;

        double percentageLeft = 100.0 - (1 - (double) daysPassed / totalDaysInYear) * 100;

        String percentage = String.format("%.2f", percentageLeft);

        return YearPercentageResponse.builder()
                .percent(percentage)
                .build();
    }
}
