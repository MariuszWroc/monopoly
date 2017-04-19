package com.monopoly.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monopoly.model.MailBox;
import com.monopoly.service.MailService;

@RestController
public class EmailController {
	private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

	@Autowired
	private MailService mailSender;

	@PostMapping(value = "/email/send")
	public ResponseEntity<List<ObjectError>> sendEmail(@RequestBody @Valid MailBox email, BindingResult result) {
		logger.info("Validating email " + email);
		if (!result.hasErrors()) {
			mailSender.sendMail(email);
			return new ResponseEntity<>(result.getAllErrors(), HttpStatus.OK);
		} else {
			logger.info("Validation failed. " + result.getFieldError());
			return new ResponseEntity<>(result.getAllErrors(), HttpStatus.CONFLICT);
		}
	}
}
