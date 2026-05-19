import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.Radio;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource({
            "9, 9",
            "-1, 0",
            "0, 0",
            "1, 1",
            "8, 8",
            "10, 9",
            "-5, 0",
            "4, 4",
            "12, 9"
    })
    public void setStationNumberTest(int stationNumber, int expected) {
        radio.setStationNumber(stationNumber);
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "-1, 0",
            "1, 1",
            "99, 99",
            "100, 100",
            "101, 100",
            "-5, 0",
            "55, 55",
            "134, 100"
    })
    void setCurrentVolumeTest(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "5, 6",
            "8, 9",
            "9, 0"
    })
    void nextTest(int stationNumber, int expected) {
        radio.setStationNumber(stationNumber);
        radio.next();
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 9",
            "1, 0",
            "5, 4",
            "8, 7",
            "9, 8"
    })
    void prevTest(int stationNumber, int expected) {
        radio.setStationNumber(stationNumber);
        radio.prev();
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "55, 56",
            "82, 83",
            "99, 100",
            "100, 100",
            "101, 100",
            "-1, 1"
    })
    void increaseVolumeTet(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 0",
            "55, 54",
            "82, 81",
            "99, 98",
            "100, 99",
            "101, 99",
            "-1, 0"
    })
    void decreaseVolumeTest(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}