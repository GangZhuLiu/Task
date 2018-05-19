package dao;

import model.Person;

import java.util.List;

public interface PersonMapper {
    void addPerson(Person person) ;
    Person selectPerson(int id);
    void deletePerson(int id);
    void updatePerson(Person person);
    List<Person> ListAll();
}
