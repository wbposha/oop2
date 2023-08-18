package org.example;

import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testInvalid() {
        Radio radio = new Radio();

        radio.setCurrentStation(-3);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreThanPossible() {
        Radio radio = new Radio();

        radio.setCurrentStation(30);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPossibleSecond() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testImPossible() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextToImpossibleStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstPrevTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondPrevTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void thiredPrevtest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}



