package datev.schulung.java.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/person")
@RequiredArgsConstructor
@Validated
public class PersonController {

    private final PersonService service;

    @GetMapping
    public Person getPerson() {
        return service.getPerson();
    }

    @PutMapping
    public void setPerson(@Valid @RequestBody Person person) {
        // ...
    }

}
