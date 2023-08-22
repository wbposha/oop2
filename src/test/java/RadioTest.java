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
    public void thirdPrevTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstVolumeSetTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(200);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondVolumeSetTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int actual = radio.getCurrentVolume();
        int expected = 50;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void thirdVolumeSetTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);


        int actual = radio.getCurrentVolume();
        int expected = 50;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fourthVolumeSetTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fifthVolumeSetTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sixthVolumeSetTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-100);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void seventhVolumeSetTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5000);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void eighthVolumeSetTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ninthVolumeSetTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);


        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tenthVolumeSetTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void thirdRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fourthRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(10000);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fifthRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(-10);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sixthRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void seventhRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1000);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void eighthRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tenthRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countStationsFirstTest() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(15);


        int actual = radio.getCurrentStation();
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countStationsSecondTest() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(15);


        int actual = radio.getCurrentStation();
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countImpossibleStations() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(51);


        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countPossibleStations() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(0);
        radio.next();


        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countPossibleStationsSecondTest() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(50);
        radio.prev();


        int actual = radio.getCurrentStation();
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countPossibleStationsThirdTest() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(50);
        radio.prev();


        int actual = radio.getCurrentStation();
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  nextTest() {
        Radio radio = new Radio();

        radio.getCurrentStation();
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  nextSecondTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  prevTest() {
        Radio radio = new Radio();

        radio.getCurrentStation();
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  prevSecondTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

}



