import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Book> sortedByBookName = new TreeSet<>();
        Book book1 = new Book("Şeker Portakalı", 183, "José Mauro de Vasconcelos", "1968");
        Book book2 = new Book("Delifişek", 160, "José Mauro de Vasconcelos", "1960");
        Book book3 = new Book("Kürk Mantolu Madonna", 177, "Sabahattin Ali", "1943");
        Book book4 = new Book("Fahrenheit 451", 350, "Ray Bradbury", "1953");


        sortedByBookName.add(book1);
        sortedByBookName.add(book2);
        sortedByBookName.add(book3);
        sortedByBookName.add(book4);
        System.out.println("##########################################");
        System.out.println("Sorted by book name : \n");
        sortedByBookName.stream().forEach(book -> System.out.println(book.getBook_name()));

        Set<Book> sortedByPagesOfBook = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPages() - o2.getNumberOfPages();
            }
        });
        System.out.println("##########################################");

        System.out.println("Sorted by pages of book: \n");
        sortedByBookName.stream().forEach(book -> System.out.println(book.getBook_name()));
        System.out.println("##########################################");
    }
}
