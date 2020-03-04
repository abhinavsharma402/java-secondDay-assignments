package com.knoldus.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ManLivedSeconds {
    long getManLivedSeconds(LocalDate birthDate, LocalDate deathDate);
}
