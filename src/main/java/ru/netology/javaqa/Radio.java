package ru.netology.javaqa;

public class Radio {
    private int stationNumber;
    private int currentVolume;

    public Radio() {
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= 9) {
            this.stationNumber = stationNumber;
        } else if (stationNumber < 0) {
            this.stationNumber = 0;
        } else {
            this.stationNumber = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        } else if (currentVolume < 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume = 100;
        }
    }

    public void next() {
        if (stationNumber < 9) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
    }

    public void prev() {
        if (stationNumber > 0) {
            stationNumber--;
        } else {
            stationNumber = 9;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}