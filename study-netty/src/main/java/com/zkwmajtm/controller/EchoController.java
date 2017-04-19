package com.zkwmajtm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EchoController {
	
	@Value("${netty.port}")
	private String nettyPort;
	
	private static final Logger logger = LoggerFactory.getLogger(EchoController.class);
	
	@RequestMapping("/getNetty")
	public Object getNettyPort(){
		logger.debug("test");
		logger.debug(nettyPort);
		return "test";
	}
}
