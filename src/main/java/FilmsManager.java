import java.util.Arrays;

public class FilmsManager {
    private String[] films = new String[0];
    private int limit;

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public FilmsManager() {
        limit = 10;
    }

    public void addFilms(String film) {

        String[] tem = new String[films.length + 1];

        for (int i = 0; i < films.length; i++) {
            tem[i] = films[i];
        }
        tem[tem.length - 1] = film;
        films = tem;
    }

    public String[] findAllFilms() {
        return films;
    }

    public String[] findLast() {

        int resultLength;

        if (films.length < limit) {
            resultLength = films.length;
        } else resultLength = limit;

        String[] tem = new String[resultLength];

        for (int i = 0; i < tem.length; i++) {
            tem[i] = films[films.length - 1 - i];
        }
        return tem;
    }

}
