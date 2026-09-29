import java.time.LocalDate;
 class ItemLibrary{
    private String nameBook;
    private String nameAuthor;
    private LocalDate PublicAuthor;

    public ItemLibrary(LocalDate PublicAuthor, String nameAuthor, String nameBook) {
        this.PublicAuthor = PublicAuthor;
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
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
    
}