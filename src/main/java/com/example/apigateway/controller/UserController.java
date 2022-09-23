package com.example.apigateway.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import jdk.internal.org.jline.utils.Log;

@RestController
public class UserController {
	
	@Autowired
	private ExchangeRateProxy exchangeRateProxy;

}
