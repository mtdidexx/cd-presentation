package com.idexx.lims.llm.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirthdayControllerTest {

    private BirthdayController controller;

    @Before
    public void setup() {
        controller = new BirthdayController(null);
    }

    @After
    public void tearDown() {
        controller = null;
    }

    @Test
    public void birthday() {
        String result = controller.getDayOfWeek("2019-10-15");
        assertEquals("foo", result);
    }
}
