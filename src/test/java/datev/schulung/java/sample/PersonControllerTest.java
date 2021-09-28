package datev.schulung.java.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ValidationException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(classes = SpringSampleApplication.class)
public class PersonControllerTest {

    @Autowired
    PersonController controller;

    @Test
    void testGetPersonNotNull() {
        Person p = controller.getPerson();
        assertNotNull(p);
    }

    @Test
    void testSetPersonValidation() {
        Person p = new Person();
        assertThrows(ValidationException.class, () ->  controller.setPerson(p));
    }

}
