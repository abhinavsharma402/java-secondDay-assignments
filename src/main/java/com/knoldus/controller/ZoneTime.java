package com.knoldus.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.time.ZoneOffset.UTC;

public class ZoneTime {
    public ZonedDateTime getZoneTime(String zone) {
        ZonedDateTime localDate = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        return localDate.withZoneSameInstant(UTC);

    }
}
