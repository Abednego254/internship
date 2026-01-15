package io.github;

public class EBook extends Book {
    @Override
    public void readBook() {
        System.out.println("Read a book");
    }

    @Override
    public void setBookMark() {
        System.out.println("Set a book mark");
    }
}
