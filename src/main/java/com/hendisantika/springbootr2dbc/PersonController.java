package com.hendisantika.springbootr2dbc;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-r2dbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/01/20
 * Time: 18.51
 */
@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository repository;

    @GetMapping
    public Flux<Person> findAll() {
        return repository.findAll();
    }
}