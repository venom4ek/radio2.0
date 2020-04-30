package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioServiceTest {

    RadioService radio = new RadioService();


    @Test
    public void setUpCurrentVolume1() {
        radio.setCurrentVolume(2);
        radio.setUpCurrentVolume();
        int expected = 3;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @BeforeEach
    @Test
    public void setUpCurrentVolumeWhenMax() {
        radio.setCurrentVolume(10);
        radio.setUpCurrentVolume();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @BeforeEach
    @Test
    public void setDownCurrentVolume() {
        radio.setCurrentVolume(2);
        radio.setDownCurrentVolume();
        int expected = 1;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @BeforeEach
    @Test
    public void setDownCurrentVolumeWhenMin() {
        radio.setCurrentVolume(0);
        radio.setDownCurrentVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @BeforeEach
    @Test
    public void setUpCurrentStation() {
        radio.setCurrentStation(7);
        radio.setUpCurrentStation();
        int expected = 8;
        assertEquals(expected, radio.getCurrentStation());
    }

    @BeforeEach
    @Test
    public void setFirstStationWhenLast() {
        radio.setCurrentStation(9);
        radio.setUpCurrentStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @BeforeEach
    @Test
    public void setDownCurrentStation() {
        radio.setCurrentStation(2);
        radio.setDownCurrentStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @BeforeEach
    @Test
    public void setLastStationWhenFirst() {
        radio.setCurrentStation(0);
        radio.setDownCurrentStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }

    @BeforeEach
    @Test
    public void setRadio() {
        radio.setCurrentStation(2);
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }

    @BeforeEach
    @Test
    public void setCurrentVolumme() {
        radio.setCurrentVolume(2);
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }
}