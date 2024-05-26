public class Main {
    public static void main(String[] args) {
        Author author = new Author("Harry", "Potter");
        Book hogwarts = new Book("Магия", author, 1444);
        System.out.println(hogwarts.getTitle() + " : " + author.getFirstname() + " " + author.getLastname() + " Издание: " +  hogwarts.getPublisherYear() + " года");
        hogwarts.setPublisherYear(843);
        System.out.println(hogwarts.getTitle() + " : " + author.getFirstname() + " " + author.getLastname() + " Издание: " +  hogwarts.getPublisherYear() + " года");

        System.out.println();
        Author jamesBrody = new Author("Джеймс", "Броуди");
        Book farCry3 = new Book("Far Cry 3", jamesBrody, 2013);
        System.out.println(farCry3.getTitle() + ": " + jamesBrody.getFirstname() + " " + jamesBrody.getLastname() + ": Полное издание "  + farCry3.getPublisherYear() + " Года");

    }
}