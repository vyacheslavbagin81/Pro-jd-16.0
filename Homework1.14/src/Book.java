import java.util.Objects;

public class Book {
    private String title;
    private Author name;
    private int yearOfPublication;

    public Book(String title, Author name, int yearOfPublication) {
        this.title = title;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getName() {
        return this.name;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (name != book.name) {
            return false;
        }
        if (yearOfPublication != book.yearOfPublication) {
            return false;
        }
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, name, yearOfPublication);
    }

    @Override
    public String toString() {
        return name + " " + title + " " + yearOfPublication;
    }
}
