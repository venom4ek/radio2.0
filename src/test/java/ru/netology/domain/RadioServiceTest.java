package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioServiceTest {
    private RadioService radio;

    @BeforeEach
    public void radio() {
        this.radio = new RadioService(0,9,0,100);
    }

    @Test
    void setCountStation() {
        RadioService radio2 = new RadioService(20);
        assertEquals(19, radio2.getMaxStation());
    }

    @Test
    void setCurrentVolume() {
        radio.setCurrentVolume(20);
        int expected = 20;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setUpCurrentVolume1() {
        radio.setCurrentVolume(12);
        radio.setUpCurrentVolume();
        int expected = 13;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setUpCurrentVolumeWhenMax() {
        radio.setCurrentVolume(100);
        radio.setUpCurrentVolume();
        int expected = 1;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setDownCurrentVolume() {
        radio.setCurrentVolume(2);
        radio.setDownCurrentVolume();
        int expected = 1;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setDownCurrentVolumeWhenMin() {
        radio.setCurrentVolume(0);
        radio.setDownCurrentVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setUpCurrentStation() {
        radio.setCurrentStation(7);
        radio.setUpCurrentStation();
        int expected = 8;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setUpUserCurrentStation() {
        RadioService radio2 = new RadioService(20);
        radio2.setCurrentStation(18);
        radio2.setUpCurrentStation();
        int expected = 19;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    void setFirstStationWhenLast() {
        radio.setCurrentStation(9);
        radio.setUpCurrentStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setUserFirstStationWhenLast() {
        RadioService radio2 = new RadioService(20);
        radio2.setCurrentStation(19);
        radio2.setUpCurrentStation();
        int expected = 0;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    void setDownCurrentStation() {
        radio.setCurrentStation(2);
        radio.setDownCurrentStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setDownUsersCurrentStation() {
        RadioService radio2 = new RadioService(20);
        radio2.setCurrentStation(5);
        radio2.setDownCurrentStation();
        int expected = 4;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    void setLastStationWhenFirst() {
        radio.setCurrentStation(0);
        radio.setDownCurrentStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setUserLastStationWhenFirst() {
        RadioService radio2 = new RadioService(20);
        radio2.setCurrentStation(0);
        radio2.setDownCurrentStation();
        int expected = 19;
        assertEquals(expected, radio2.getCurrentStation());
    }

    @Test
    void setRadio() {
        radio.setCurrentStation(2);
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setOverMaxRadio() {
        radio.setCurrentStation(12);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setUnderMinRadio() {
        radio.setCurrentStation(-10);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

}