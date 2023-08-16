package org.example;
import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void radioTest() {
        Radio rad = new Radio(9, 0);

        Assertions.assertEquals(0, rad.minRadioStation());
        Assertions.assertEquals(0, rad.maxRadioStation());
        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }
}

