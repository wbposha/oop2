package org.example;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;

    private int maxRadioStation = 9;
    private int minRadioStation = 0;

    private int maxVolume = 99;
    private int minVolume = 0;

    public Radio(int maxRadioStation, int minRadioStation ) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
    }

   public Radio(int size) {
        maxRadioStation = minRadioStation + size;
   }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void previouslyStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }


    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int maxVolume() {
        if (currentVolume == 100) {
            currentVolume = currentVolume + 0;
        }
        return 0;
    }

    public short minVolume() {
        if (currentVolume == 0) {
            currentVolume = currentVolume - 0;
        }
        return 0;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void volumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public int minRadioStation() {
        return 0;
    }

    public int maxRadioStation() {
        return 0;
    }

    public int getMinVolume () {
        return  0;
    }

    public int getMinRadioStation() {
        return 0;
    }
}
