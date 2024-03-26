package com.springevents.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class SmsEventListener {

	@EventListener
//	@Order(2)
	@Async
	public void sendSms(NotificationEvents event) throws InterruptedException {
		System.out.println("Sending the SMS to " + event.getUsername());
		Thread.sleep(5000);
		System.out.println("SMS sended..");
	}
}
