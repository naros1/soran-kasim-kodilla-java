package com.kodilla.good.patterns.challanges.flightcompany;

import java.time.LocalDateTime;

public class SerchRequest {
    private String dpeatureCity;
    private String arvivalCity;
    private LocalDateTime depatureSerchDate;

    public SerchRequest(String dpeatureCity, String arvival, LocalDateTime depatureSerchDate) {
        this.dpeatureCity = dpeatureCity;
        this.arvivalCity = arvival;
        this.depatureSerchDate = depatureSerchDate;
    }

    public String getDpeatureCity() {
        return dpeatureCity;
    }

    public String getArvivalCity() {
        return arvivalCity;
    }

    public LocalDateTime getDepatureSerchDate() {
        return depatureSerchDate;
    }
}
