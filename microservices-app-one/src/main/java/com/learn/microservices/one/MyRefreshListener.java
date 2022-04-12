package com.learn.microservices.one;

import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class MyRefreshListener implements ApplicationListener<EnvironmentChangeEvent> {
	
	//@Autowired RefreshScopedService refreshScopedService;

	@Override
	public void onApplicationEvent(EnvironmentChangeEvent event) {
		System.out.println("Hello There Im hitting the keys "+event.getKeys());
//		if(event.getKeys().contains("tps")) {
//			refreshScopedService.refresh();
//		}
	}
}
