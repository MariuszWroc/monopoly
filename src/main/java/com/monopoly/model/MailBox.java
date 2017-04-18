package com.monopoly.model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Email;

public class MailBox {
	@NotBlank
	@Email(message = "Please enter your email addresss.")
	private String sender;
	@NotBlank
	private String subject;
	@NotBlank
	private String body;
	private final String receiver  = "mariusz.zlatan@gmail.com";
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getReceiver() {
		return receiver;
	}

    @Override
    public String toString() {
        return "Email{" + "sender=" + sender + ", subject=" + subject + ", body=" + body + ", receiver=" + receiver + '}';
    }
}
