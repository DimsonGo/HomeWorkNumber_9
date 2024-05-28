import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Harry", "Potter");
        Book hogwarts = new Book("\"Магия\"", author, 1456);
        System.out.println(hogwarts);
        hogwarts.setPublisherYear(843);
        System.out.println(hogwarts);

        System.out.println();
        Author jamesBrody = new Author("Джеймсон", "Броуди"); //
        Book farCry3 = new Book("Far Cry 3", jamesBrody, 2013);
        System.out.println(farCry3);


        System.out.println();
        Author conorMcGregor = new Author("Джеймсон", "Броуди");
        Book realLife = new Book("Far Cry 3", conorMcGregor, 2019);
        System.out.println(realLife);

        System.out.println();
        System.out.println("Продолжение задания");

        System.out.println("Хеш-Код");
        System.out.println(jamesBrody.hashCode());

        System.out.println();
        System.out.println("Сравниние авторов");

        if (jamesBrody.equals(conorMcGregor)) {
            System.out.println("Авторы равны");
        } else {
            System.out.println("Авторы не равны");
        }

        System.out.println();
        System.out.println("Хеш-код книг");
        System.out.println("Хеш-код книги Hogwarts - " + hogwarts.hashCode());
        System.out.println("Хеш-код книги Far Cry 3 - " + farCry3.hashCode());

        System.out.println();
        System.out.println("Сравнение книг");
        if (hogwarts.equals(farCry3)) {
            System.out.println("Название книг равны!");
        } else {
            System.out.println("Название книг не равны!");
        }
    }
}