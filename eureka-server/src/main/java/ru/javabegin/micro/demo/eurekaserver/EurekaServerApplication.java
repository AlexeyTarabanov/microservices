package ru.javabegin.micro.demo.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
// сервер - контейнер для МС
// клиент - поставщик МС, который будет опубликовывать свои МС на сервер
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
