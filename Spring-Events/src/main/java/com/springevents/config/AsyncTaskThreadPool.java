package com.springevents.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncTaskThreadPool {

	@Bean
	public ThreadPoolTaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor executor= new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(10);
		executor.setMaxPoolSize(20);
		executor.setThreadNamePrefix("MyAysncThread-");
		executor.initialize();
		return  executor;
	}
	
/*


In Spring's asynchronous event handling mechanism, the threads that execute the asynchronous event listeners are managed by 
Spring's TaskExecutor

	
	
*/
	
	
}
