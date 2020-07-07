package cn.itcast.crm.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.crm.dao.ICustomerDao;
import cn.itcast.crm.domain.Customer;

public class CustomerDao extends HibernateDaoSupport implements ICustomerDao {

	public List<Customer> findAll(){
		return (List<Customer>)getHibernateTemplate().find("from Customer");
	}
}
