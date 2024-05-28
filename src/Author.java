import java.util.Objects;

public class Author {
    private String firstname; //имя //приват
    private String lastname; //фамилия //приват

    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String toString() {
        return this.firstname + " " + this.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstname, author.firstname) && Objects.equals(lastname, author.lastname);
    }

    //Метод хеш код возращает некое число. У нас есть конкретное число в методе хеш кода это int. Именно int
    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
