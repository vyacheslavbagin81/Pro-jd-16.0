public class Main {
    public static void main(String[] args) {
        Author pelevin = new Author("Виктор", "Пелевин");
        Author chekhov = new Author("Антон", "Чехов");
        Author pekhov = new Author("Алексей", "Пехов");
        Book bookPelevin = new Book("Generation \"П\"", pelevin, 1999);
        Book bookChekhov = new Book("Три сестры", chekhov, 1900);
        Book bookPekhov = new Book("Крадущийся в тени", pekhov, 2002);
        bookChekhov.setYearOfPublication(1901);
    }
}