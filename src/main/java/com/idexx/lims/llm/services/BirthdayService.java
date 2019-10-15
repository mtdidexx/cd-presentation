package com.idexx.lims.llm.services;

import java.time.LocalDate;

public interface BirthdayService {
    LocalDate getValidBirthday(String birthDayString);
    String getBirthDayofWeek(LocalDate birthday);
    String getChineseZodiac(LocalDate birthday);
    String getStarSign(LocalDate birthday);
}
