package ru.netology.javaqa;

public class Radio {
    private int stationNumber;
    private int currentVolume;
    private int countStation = 10;

    public Radio() {
    }

    public Radio(int countStation) {
        if (countStation > 0) {
            this.countStation = countStation;
        }
    }

    public void setCountStation(int countStation) {
        if (countStation > 0) {
            this.countStation = countStation;
        }
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= countStation - 1) {
            this.stationNumber = stationNumber;
        } else if (stationNumber < 0) {
            this.stationNumber = 0;
        } else {
            this.stationNumber = countStation - 1;
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
        if (stationNumber < countStation - 1) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
    }

    public void prev() {
        if (stationNumber > 0) {
            stationNumber--;
        } else {
            stationNumber = countStation - 1;
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