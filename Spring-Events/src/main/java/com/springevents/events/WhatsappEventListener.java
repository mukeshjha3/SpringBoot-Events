package com.springevents.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class WhatsappEventListener {

	@EventListener()
	@Async
	public void sendWhatsapp(NotificationEvents event) {
		System.out.println("Sending the whatsapp message") ;
		System.out.println(Thread.currentThread().getName());
		System.out.println("Whatsapp SMS sent...");
	}
}
