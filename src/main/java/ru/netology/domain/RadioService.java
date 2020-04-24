package ru.netology.domain;

import java.io.InputStream;
import java.util.Scanner;

public class RadioService {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxxStation) {
        this.maxStation = maxxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setUpCurrentVolume(int currentVolume) {
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume + 1;
    }


    public void setDownCurrentVolume(int currentVolume) {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;

    }

    public void setUpCurrentStation(int currentStation) {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        } else this.currentStation = currentStation + 1;
    }

    public void setDownCurrentStation(int currentStation) {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        } else this.currentStation = currentStation - 1;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
}
