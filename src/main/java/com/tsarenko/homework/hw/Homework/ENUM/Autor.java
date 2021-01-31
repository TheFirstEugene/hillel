package com.tsarenko.homework.hw.Homework.ENUM;


import java.util.Date;

public class Autor {
    String firstName;
    String lastname;
    Date dateOfBirth;


    Autor(String name1, String name2, final Date dateOfBirth) {
        this.firstName = name1;
        this.lastname = name2;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        if (!firstName.equals(autor.firstName)) return false;
        if (!lastname.equals(autor.lastname)) return false;
        return dateOfBirth.equals(autor.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return firstName + " " + lastname + "\n" + "Date of birth: " + dateOfBirth;

    }
}
