package com.idexx.lims.llm.services;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BasicBirthdayService implements BirthdayService {
    @Override
    public LocalDate getValidBirthday(String birthDayString) {
        if (birthDayString == null) {
            throw new RuntimeException("Must include a date");
        }
        try {
            return LocalDate.parse(birthDayString);
        } catch (Exception e) {
            throw new RuntimeException("Must include a valid birthday in yyyy-MM-dd format");
        }
    }

    @Override
    public String getBirthDayofWeek(LocalDate birthday) {
        return null;
    }

    @Override
    public String getChineseZodiac(LocalDate birthday) {
        return null;
    }

    @Override
    public String getStarSign(LocalDate birthday) {
        return null;
    }
}
