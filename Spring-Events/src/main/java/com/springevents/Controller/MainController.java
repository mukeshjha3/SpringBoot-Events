package com.springevents.Controller;

import java.util.ArrayList;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springevents.events.MailEventListener;
import com.springevents.events.NotificationEvents;
import com.springevents.events.WhatsappEventListener;
import com.springevents.model.User;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MainController {

	private final ApplicationEventPublisher applicationEventPublisher;
	
	ArrayList<User> list= new ArrayList<>();
	
	@GetMapping("/register")
	public String sendNotification(@RequestBody User user) {
		list.add(user);
		System.out.println("Publishing the Event....");
		
		applicationEventPublisher.publishEvent(new NotificationEvents(user.getUserName()));
		System.out.println("All events has been published.....");
		return "User registered successfully......";
}
}
