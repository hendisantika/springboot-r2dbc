package com.hendisantika.springbootr2dbc;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-r2dbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/01/20
 * Time: 18.50
 */
public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {
}
