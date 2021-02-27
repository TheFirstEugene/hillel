package Homework14;

public class DataMapper {
    public Person map(String personData){
        String [] data = personData.split(",");
        return new Person(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]),
                Integer.parseInt(data[4]), data[5]);
    }

}
