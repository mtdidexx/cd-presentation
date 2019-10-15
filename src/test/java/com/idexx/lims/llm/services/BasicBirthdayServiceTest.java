package com.idexx.lims.llm.services;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.assertEquals;

//@RunWith(Parameterized.class)
public class BasicBirthdayServiceTest {
    BasicBirthdayService service;

    @Before
    public void setup() {
        service = new BasicBirthdayService();
    }

    @After
    public void teardown() {
        service = null;
    }

    @Test
    public void todayIsMyBirthday() {
        LocalDate result = service.getValidBirthday(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        assertEquals("Expected today's date", LocalDate.now(), result);
    }

    @Test(expected = RuntimeException.class)
    public void nullBirthday() {
        service.getValidBirthday(null);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void badIntputBirthday() {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Must include a valid birthday");
        LocalDate result = service.getValidBirthday("NOT A DATE");
    }
}
