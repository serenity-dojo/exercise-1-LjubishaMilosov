package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    @Test
    public void convertingCelsiusToFahrenheit(){

        double celsius = 10.0;
        double fahrenheit;

        fahrenheit = (celsius * 1.8) + 32;
        assertThat(fahrenheit, equalTo(50.0));
    }

    @Test
    public void convertingKilogramsToPounds(){

        double kilograms = 10.0;
        double pounds;

        pounds = kilograms * 2.2046226218;
        assertThat(pounds, equalTo(22.046226218));
    }
}
