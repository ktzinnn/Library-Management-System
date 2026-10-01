import java.time.LocalDate;

class Book {
    private int idBook;
    private String nameBook;
    private String nameAuthor;
    private LocalDate PublicAuthor;

    public Book(){

    }

    public Book(LocalDate PublicAuthor, String nameAuthor, String nameBook, int idBook) {
        this.PublicAuthor = PublicAuthor;
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public LocalDate getPublicAuthor() {
        return PublicAuthor;
    }

    public void setPublicAuthor(LocalDate PublicAuthor) {
        this.PublicAuthor = PublicAuthor;
    }


    public int getIdBook() {
        return idBook;
    }


    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

}