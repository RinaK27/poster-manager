import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void testFindAll() {
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";

        Manager manager = new Manager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";

        Manager manager = new Manager(7);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastEqualsTheLimit() {
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";
        String movie8 = "Номер два";
        String movie9 = "Номер три";
        String movie10 = "Номер четыре";

        Manager manager = new Manager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);


        String[] expected = {
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastUnderLimit() {
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";

        Manager manager = new Manager(6);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastAboveLimit() {
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";
        String movie8 = "Номер два";
        String movie9 = "Номер три";
        String movie10 = "Номер четыре";
        String movie11 = "Номер пять";

        Manager manager = new Manager(10);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);


        String[] expected = {
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

