package HW9.lombok;
import lombok.Value;
import java.util.Date;

@Value
public class Author {
    String firstName;
    String lastname;
    Date dateOfBirth;

    Author(String name1, String name2, final Date dateOfBirth) {
        this.firstName = name1;
        this.lastname = name2;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }
    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    @Override
    public String toString() {
        return firstName + " " + lastname + "\n" + "Date of birth: " + dateOfBirth;
    }
}
