public class Book implements Comparable<Book> {
    private String book_name;
    private Integer numberOfPages;
    private String author_name;
    private String release_date;

    public Book(String book_name, Integer numberOfPages, String author_name, String release_date) {
        this.book_name = book_name;
        this.numberOfPages = numberOfPages;
        this.author_name = author_name;
        this.release_date = release_date;
    }

    @Override
    public int compareTo(Book o) {
        return getBook_name().compareTo(o.getBook_name());
    }


    // ************************************* GETTER METHODS ***********************************
    public String getBook_name() {
        return book_name;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getRelease_date() {
        return release_date;
    }

}
