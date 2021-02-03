package HW9.lombok;
import lombok.Value;
import java.util.Date;


@Value
public class Book {
    Author author;
    Date issueDate;
    String genge;
    long isbn;

    public Book(Author name, String genge, long barcode, Date issueDate) {
        this.author = name;
        this.issueDate = new Date(issueDate.getTime());
        this.genge = genge;
        this.isbn = barcode;
    }
    public Date getIssueDate() {
        return new Date(issueDate.getTime());
    }
    @Override

    public String toString() {
        return "BOOK [" + "\n" + "Autor: " + author + "\n" + "Genge: "
                + genge + "\n" + "Date of release: " + issueDate
                + "\n" + "isbn: " + isbn + " ]";
    }
}