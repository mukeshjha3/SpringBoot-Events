package com.springevents.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class SmsEventListener {

	@EventListener
	@Async
	public void sendSms(NotificationEvents event) throws InterruptedException {
		System.out.println("Sending the SMS to ");
		System.out.println(Thread.currentThread().getName());
		System.out.println("SMS sended..");
	}
}
