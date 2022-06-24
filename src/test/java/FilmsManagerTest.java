import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

public class FilmsManagerTest {
    @Test
    public void shouldFindAllFilms() {
        FilmsManager manager = new FilmsManager();
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Бельград");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-Невидимка");
        manager.addFilms("Тролли. Мировой тур");
        manager.addFilms("Номер один");
        String[] actual = manager.findAllFilms();
        String[] expected = {"Бладшот",
                "Вперёд",
                "Отель Бельград",
                "Джентельмены",
                "Человек-Невидимка",
                "Тролли. Мировой тур",
                "Номер один"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmsManager manager = new FilmsManager();
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Отель Бельград");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-Невидимка");
        manager.addFilms("Тролли. Мировой тур");
        manager.addFilms("Номер один");
        String[] actual = manager.findLast();
        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-Невидимка",
                "Джентельмены",
                "Отель Бельград",
                "Вперёд",
                "Бладшот",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMoreFindAllFilms() {
        FilmsManager manager = new FilmsManager(15);
        manager.addFilms("Бладшот1");
        manager.addFilms("Вперёд2");
        manager.addFilms("Отель Бельград3");
        manager.addFilms("Джентельмены4");
        manager.addFilms("Человек-Невидимка5");
        manager.addFilms("Тролли. Мировой тур6");
        manager.addFilms("Номер один7");
        manager.addFilms("Номер один8");
        manager.addFilms("Номер один9");
        manager.addFilms("Номер один10");
        manager.addFilms("Номер один11");
        manager.addFilms("Номер один12");
        manager.addFilms("Номер один13");
        manager.addFilms("Номер один14");
        manager.addFilms("Номер один15");
        String[] actual = manager.findAllFilms();
        String[] expected = {
                "Бладшот1",
                "Вперёд2",
                "Отель Бельград3",
                "Джентельмены4",
                "Человек-Невидимка5",
                "Тролли. Мировой тур6",
                "Номер один7",
                "Номер один8",
                "Номер один9",
                "Номер один10",
                "Номер один11",
                "Номер один12",
                "Номер один13",
                "Номер один14",
                "Номер один15"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldMoreLimitFindAllFilms() {
        FilmsManager manager = new FilmsManager(15);
        manager.addFilms("Бладшот1");
        manager.addFilms("Вперёд2");
        manager.addFilms("Отель Бельград3");
        manager.addFilms("Джентельмены4");
        manager.addFilms("Человек-Невидимка5");
        manager.addFilms("Тролли. Мировой тур6");
        manager.addFilms("Номер один7");
        manager.addFilms("Номер один8");
        manager.addFilms("Номер один9");
        manager.addFilms("Номер один10");
        manager.addFilms("Номер один11");
        manager.addFilms("Номер один12");
        manager.addFilms("Номер один13");
        manager.addFilms("Номер один14");
        manager.addFilms("Номер один15");
        String[] actual = manager.findLast();
        String[] expected = {
                "Номер один15",
                "Номер один14",
                "Номер один13",
                "Номер один12",
                "Номер один11",
                "Номер один10",
                "Номер один9",
                "Номер один8",
                "Номер один7",
                "Тролли. Мировой тур6",
                "Человек-Невидимка5",
                "Джентельмены4",
                "Отель Бельград3",
                "Вперёд2",
                "Бладшот1",
        };
        Assertions.assertArrayEquals(expected, actual);
    }
}
