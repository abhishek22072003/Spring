package com.springcore.lifecycle;

import javax.swing.AbstractAction;
import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		Samosa samosa = (Samosa)context.getBean("samosa");
		System.out.println(samosa);		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Pepsi pepsi = (Pepsi)context.getBean("pepsi");
		System.out.println(pepsi);
		Example example = (Example)context.getBean("example");
		System.out.println(example);
	}
}
