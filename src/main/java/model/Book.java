package model;

public class Book implements Publication {
    private String title;
    private String author;
    private int yearPublication;

    public Book(String title, String author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
