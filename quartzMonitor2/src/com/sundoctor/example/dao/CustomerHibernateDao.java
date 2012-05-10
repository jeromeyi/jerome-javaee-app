package com.sundoctor.example.dao;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.sundoctor.example.model.Customer;
import com.sundoctor.example.service.CustomerService;

@Repository("customerDao")
public class CustomerHibernateDao extends HibernateDaoSupport {

	private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

	public Customer getCustomer2() {	
		return (Customer) this.getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) {
				Customer customer = (Customer) session.createQuery("from Customer where id = 1").uniqueResult();
				logger.info("Customer2={}", customer);
				return customer;
			}
		});
	}

	public Customer getCustomer1() {		
		Customer customer = (Customer) this.getHibernateTemplate().get(Customer.class, 1);
		logger.info("Customer1={}", customer);
		return customer;
	}

}
