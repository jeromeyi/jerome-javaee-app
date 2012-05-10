package com.sundoctor.example.service;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sundoctor.example.dao.CustomerHibernateDao;
import com.sundoctor.example.model.Customer;

@Service("customerService")
public class CustomerService implements Serializable {

	private static final long serialVersionUID = -6857596724821490041L;
	private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);
	private SpringBeanService springBeanService;

	@Autowired
	public void setSpringBeanService(@Qualifier("springBeanService") SpringBeanService springBeanService) {
		this.springBeanService = springBeanService;
	}

	public void testMethod1() {
		// 这里执行定时调度业务		
		CustomerHibernateDao customerDao =springBeanService.getBean(CustomerHibernateDao.class,"customerDao");
		Customer customer = customerDao.getCustomer1();
		logger.info("AAAA:{}", customer);

	}

	public void testMethod2() {
		// 这里执行定时调度业务
		CustomerHibernateDao customerDao =springBeanService.getBean(CustomerHibernateDao.class,"customerDao");
		Customer customer = customerDao.getCustomer2();
		logger.info("BBBB:{}", customer);
	}

}
