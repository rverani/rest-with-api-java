package br.com.estudo.rest.services;

import br.com.estudo.rest.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id) {
        logger.info("Procurando primeira pessoa");

        Person person =  new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstname("Rubens");
        person.setLastname("Verani");
        person.setAddress("Rua Juiz de Fora, 40");
        person.setGender("Homem");

        return person;
    }

    public List<Person> findAll() {
        logger.info("Procurando Lista de pessoas");
        List<Person> personList = new ArrayList<>();

        for(int i = 1; i < 8; i++) {
            Person person = mockPerson(i);
            personList.add(person);
        }
        return personList;
    }

    public Person create(Person person) {
        logger.info("Criando dados de uma Pessoa");
        return person;
    }
    public Person alter(Person person) {
        logger.info("Alterando dados de uma Pessoa");
        return person;
    }
    public void delete(String id) {
        logger.info("Apagando dados de uma Pessoa");
    }


    private Person mockPerson(int i) {
        Person person =  new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstname("First name " + i);
        person.setLastname("Last name " + i);
        person.setAddress("Address " + i);
        person.setGender("Gender " + i);

        return person;
    }

}
