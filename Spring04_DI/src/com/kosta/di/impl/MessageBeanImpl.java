package com.kosta.di.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.kosta.di.MessageBean;
import com.kosta.di.OutputBean;

public class MessageBeanImpl implements MessageBean {
	@Autowired
	private String name; 		// Constructor
	@Autowired
	private String greeting; 	// Setter
	@Autowired
	private OutputBean outputBean;
	
	public MessageBeanImpl(String name) {
		super();
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public OutputBean getOutputBean() {
		return outputBean;
	}

	@Override
	public void sayHello() {
		System.out.println(name + "::" +greeting);
		
	}

}
