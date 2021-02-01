package com.tsarenko.homework.hw.Homework.ENUM;

import java.util.Date;

public class BOOK {
    private final Autor autor;
    private final  Date issueDate;
    private final String genge;
    private final long isbn;

    public BOOK(Autor name, String genge, long barcode, Date issueDate) {
        this.autor = name;
        this.issueDate = new Date(issueDate.getTime());
        this.genge = genge;
        this.isbn = barcode;
    }

    public Autor getAutor() {
        return autor;
    }

    public Date getIssueDate() {
        return new Date(issueDate.getTime());
    }

    public String getGenge() {
        return genge;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BOOK book = (BOOK) o;

        if (isbn != book.isbn) return false;
        if (!autor.equals(book.autor)) return false;
        if (!issueDate.equals(book.issueDate)) return false;
        return genge == book.genge;
    }

    @Override
    public int hashCode() {
        int result = autor.hashCode();
        result = 31 * result + issueDate.hashCode();
        result = 31 * result + genge.hashCode();
        result = 31 * result + (int) (isbn ^ (isbn >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "BOOK [" + "\n" + "Autor: " + autor + "\n" + "Genge: "
                + genge + "\n" + "Date of release: " + issueDate
                + "\n" + "isbn: " + isbn + " ]";
    }
}
