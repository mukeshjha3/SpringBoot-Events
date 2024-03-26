package com.springevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsApplication.class, args);
	}

}/*
	
                      @Async has two limitations (package : import org.springframework.scheduling.annotation.EnableAsync;)
1 -> It must be applied to public methods only.
2 -> Self-invocation — calling the async method from within the same class — won’t work.
	
By default, event listeners are synchronous in Spring Boot. 
The publishEvent method blocks until all listeners have finished processing the event.
	
	
@EventListener(condition = "#event.username.startsWith('admin')")
 the listener method will only excecute if the username starts with ‘admin’.
 
 
Transactional events are only published after the successful completion of a transaction.
To publish a transactional event, you need to use the TransactionalApplicationEventPublisher instead of ApplicationEventPublisher;
	*/