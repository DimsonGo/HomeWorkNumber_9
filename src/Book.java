public class Book {
    private String title;
    private Author author;
    private int publisherYear;

    public Book(String title, Author author, int publisherYear) { // исправленно
        this.title = title;
        this.author = author;
        this.publisherYear = getPublisherYear(); //исправленно
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }
    public void setPublisherYear(int publisherYear){
        this.publisherYear = publisherYear;
    }
}
