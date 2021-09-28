package datev.schulung.java.sample;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PersonService {

    public Person getPerson() {
        Person p = new Person("Tom", LocalDate.now());
        return p;
    }

}
