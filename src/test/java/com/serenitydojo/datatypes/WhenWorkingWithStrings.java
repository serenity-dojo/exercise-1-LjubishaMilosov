package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {


    @Test
    public void convertingToLowerCase(){

        String fullName = "Ljubisha Milosov";
        String lowerCaseFulltName = fullName.toLowerCase();
        assertThat(lowerCaseFulltName, equalTo("ljubisha milosov"));

    }

    @Test
    public void convertingToUpperCase(){

        String fullName = "Ljubisha Milosov";
        String upperCaseFulltName = fullName.toUpperCase();
        assertThat(upperCaseFulltName, equalTo("LJUBISHA MILOSOV"));

    }
    @Test
    public void trimmingExtraSpace(){

        String fullName = " Ljubisha Milosov ";
        String extraSpaceTrimmed = fullName.trim();
        assertThat(extraSpaceTrimmed, equalTo("Ljubisha Milosov"));

    }

    @Test
    public void findingTheLengthOfString(){

        String fullName = "Ljubisha Milosov";
        assertThat(fullName.length(), equalTo(16));

    }

    @Test
    public void replacingTextInAString(){

        String fullName = "Ljubisha Milosov";
        String replacedFullName = fullName.replace("Ljubisha", "Dimitar");
        assertThat(replacedFullName, equalTo("Dimitar Milosov"));

    }
}
