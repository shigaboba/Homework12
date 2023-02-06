package Homework12;

public class Book {
    String name;
    Author author;
    int yearOfPub;

    public Book (String name, Author author, int yearOfPub) {
        this.name = name;
        this.author = author;
        this.yearOfPub = yearOfPub;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

}

