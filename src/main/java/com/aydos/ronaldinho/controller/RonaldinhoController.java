package com.aydos.ronaldinho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.aydos.ronaldinho.service.RonaldinhoService;

@RestController
public class RonaldinhoController {

	@Autowired
	RonaldinhoService ronaldinhoService;

	public String hi() {
		return ronaldinhoService.elastico();
	}

}
