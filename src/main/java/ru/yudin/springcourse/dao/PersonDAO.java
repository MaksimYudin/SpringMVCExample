package ru.yudin.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.yudin.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people = new ArrayList<>();
    private static int PEOPLE_ID;

    {
        people.add(new Person(++PEOPLE_ID, "max"));
        people.add(new Person(++PEOPLE_ID, "max1"));
        people.add(new Person(++PEOPLE_ID, "max2"));
        people.add(new Person(++PEOPLE_ID, "max3"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_ID);
        people.add(person);
    }
}
