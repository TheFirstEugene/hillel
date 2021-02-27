package Homework14;

import java.util.*;
import java.util.stream.Collectors;

public class CovidStat {
    ArrayList<Person> person;

    public CovidStat(ArrayList<Person> person) {
        this.person = person;
    }


    public String getMostPopularName() {
        Set<Map.Entry<String, Integer>> set = person.stream()
                .collect(Collectors.toMap(p -> p.getName(), word -> 1, Integer::sum)).entrySet();
        int max = Collections
                .max(set, (a, b) -> Integer.compare(a.getValue(), b.getValue())).getValue();

        List<String> list = set.stream()
                .filter(entry -> entry.getValue() == max)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        return list.get(0);
    }


    public String getMostPopularSurname() {
        Set<Map.Entry<String, Integer>> set = person.stream()
                .collect(Collectors.toMap(p -> p.getSecondName(), word -> 1, Integer::sum)).entrySet();

        int max = Collections
                .max(set, (a, b) -> Integer.compare(a.getValue(), b.getValue())).getValue();

        List<String> list = set.stream()
                .filter(entry -> entry.getValue() == max)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        return list.get(0);

    }


    public String getMostPopularMailDomain() {
        Set<Map.Entry<String, Integer>> set = person.stream()
                .collect(Collectors.toMap(p -> p.getE_mail(), word -> 1, Integer::sum)).entrySet();

        int max = Collections
                .max(set, (a, b) -> Integer.compare(a.getValue(), b.getValue())).getValue();

        List<String> list = set.stream()
                .filter(entry -> entry.getValue() == max)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        return list.get(0);

    }

    public double getAverageAge() {
        return person.stream().mapToInt(Person::getAge).average().getAsDouble();
    }

    public double getAverageHeight() {
        return person.stream().mapToInt(Person::getHeight).average().getAsDouble();
    }

    public double getAverageWeight() {
        return person.stream().mapToInt(Person::getTheWeight).average().getAsDouble();
    }

}
