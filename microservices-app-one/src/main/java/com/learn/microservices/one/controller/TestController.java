package com.learn.microservices.one.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
@RestController
@RequestMapping("/api/v1")
public class TestController {

	@Value("${test.value.from.config.server}")
	private String testValue;
	
	@GetMapping(value = "/test")
	public String testApi() {
		return testValue;
	}
}
