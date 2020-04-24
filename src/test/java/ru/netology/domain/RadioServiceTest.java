package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {
    RadioService radio = new RadioService();

    @Test
    public void setUpCurrentVolume() {
        radio.setUpCurrentVolume(2);
        int expected = 3;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setUpCurrentVolumeWhenMax() {
        radio.setUpCurrentVolume(10);
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setDownCurrentVolume() {
        radio.setDownCurrentVolume(2);
        int expected = 1;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setDownCurrentVolumeWhenMin() {
        radio.setDownCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    public void setUpCurrentStation() {
        radio.setUpCurrentStation(7);
        int expected = 8;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setFirstStationWhenLast() {
        radio.setUpCurrentStation(9);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setDownCurrentStation() {
        radio.setDownCurrentStation(2);
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setLastStationWhenFirst() {
        radio.setDownCurrentStation(0);
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void setRadio() {
        radio.setCurrentStation(2);
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }

}