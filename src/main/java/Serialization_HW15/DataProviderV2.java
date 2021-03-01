package Serialization_HW15;

import Homework14.Person;
import lombok.RequiredArgsConstructor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class DataProviderV2 implements DataProvider {
    private final String fileName;
    private DataProvider provider = (DataProvider) new DataMapperV2();
    @Override
    public List<Person> provide() {
        try {
            FileInputStream fis = new FileInputStream("D:/TestFilesForIdea/example_3.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person persons = (Person) ois.readObject();
            System.out.println(Arrays.toString(new Person[]{persons}));

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}