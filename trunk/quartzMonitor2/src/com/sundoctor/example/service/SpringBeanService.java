package com.sundoctor.example.service;

import java.io.Serializable;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;

@SuppressWarnings("unchecked")
@Service("springBeanService")
public class SpringBeanService implements Serializable{

	private static final long serialVersionUID = -2228376078979553838L;

	public <T> T getBean(Class<T> clazz,String beanName){
		ApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		return (T)context.getBean(beanName);
	}
}
