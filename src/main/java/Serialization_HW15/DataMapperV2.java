package Serialization_HW15;

import Homework14.Person;

public class DataMapperV2 {

    public Person map(String personData) {
        String[] data = personData.split(",");
        Person newPerson = new Person.PersonBuilder().name(data[0])
                .secondName(data[1])
                .age(Integer.parseInt(data[2]))
                .height(Integer.parseInt(data[4]))
                .theWeight(Integer.parseInt(data[4]))
                .e_mail(data[5])
                .build();
        return newPerson;

    }
}