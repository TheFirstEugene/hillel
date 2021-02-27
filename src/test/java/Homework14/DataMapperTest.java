package Homework14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataMapperTest {

    @Test
    void map() {
        DataMapper dataMapper = new DataMapper();
        assertEquals(dataMapper.map("Volodymyr,Zelensky,42,165,78,zelensky@ukr.com"),
                new Person("Volodymyr","Zelensky",42,165,78,"zelensky@ukr.com"));

    }
}