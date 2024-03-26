package com.springevents.events;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MailEventListener {

	@EventListener
//	@Order(1)
	@Async
	public void sendMail(NotificationEvents event) throws InterruptedException {
		System.out.println("Sending the mail to : " +event.getUsername() );
		Thread.sleep(5000);
		
		System.out.println(" mail sending completed" );
	}
}
