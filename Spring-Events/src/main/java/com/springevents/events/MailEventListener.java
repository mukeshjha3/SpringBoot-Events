package com.springevents.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MailEventListener {

	@EventListener
	@Async
	public void sendMail(NotificationEvents event) throws InterruptedException {
		System.out.println("Sending the mail  : ");
		System.out.println(Thread.currentThread().getName());
		System.out.println(" mail sending completed" );
	}
}
