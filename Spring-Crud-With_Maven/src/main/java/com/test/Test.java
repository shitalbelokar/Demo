package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EnableJpaRepositories("com.DaoI")
@EntityScan("com")
public class Test {
public static void main(String[] args) {
	System.out.println("in main method");
	SpringApplication.run(Test.class, args);
	System.out.println("main end");
}
}
