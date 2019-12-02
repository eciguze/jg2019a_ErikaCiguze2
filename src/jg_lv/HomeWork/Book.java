package jg_lv.HomeWork;

import java.util.Objects;

class Book {
    private String author;
    private String title;
    private int pageCount;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Book that = (Book) o;

        return Objects.equals(author, that.author) &&

                Objects.equals(title, that.title) &&

                Objects.equals(pageCount, that.pageCount);
    }

    @Override

    public String toString() {

        return "Book{" +

                "author='" + author + '\'' +

                ", title='" + title + '\'' +

                ", pageCount='" + pageCount +
                '}';
    }
}