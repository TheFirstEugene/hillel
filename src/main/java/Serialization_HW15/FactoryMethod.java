package Serialization_HW15;

public class FactoryMethod {
    DataProvider getInstance(String filename) {
        String[] strings = filename.split("[.]");

        if (strings.length > 0 && "csv".equals(strings[strings.length - 1])) {
            return new DataProviderV2(filename);
        } else {
            return new DataProviderFactory(filename);
        }
    }
}