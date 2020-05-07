package ru.netology.domain;


public class RadioService {


    private int minStation;
    private int maxStation;
    private int currentVolume;
    private int currentStation;
    private int minVolume;
    private int maxVolume;
    private int countStation;

    public RadioService(int countStation) {
        this.maxStation = countStation - 1;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public RadioService() {
    }

    public RadioService(int minStation, int maxStation, int minVolume, int maxVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void setUpCurrentVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }


    public void setDownCurrentVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation <= minStation) {
            return;
        }
        if (currentStation >= maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setUpCurrentStation() {
        if (currentStation >= maxStation) {
            return;
        }
        if (currentStation == minStation) {
            return;
        }
        this.currentStation++;
    }

    public void setDownCurrentStation() {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation == maxStation) {
            return;
        }
        this.currentStation--;
    }


}
