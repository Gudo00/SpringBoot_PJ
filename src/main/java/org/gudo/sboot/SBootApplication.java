package org.gudo.sboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SBootApplication.class, args);

    }

}
