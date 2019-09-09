package com.bank.web.services;

import java.util.List;

import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.domains.MemberBean;

public interface MemberService {
	public void join(CustomerBean param);
	public void register(EmployeeBean param);
	public List<CustomerBean> findAllCustomers();
	public List<EmployeeBean> findAllEmployees();
	public List<MemberBean> findByName(String name); 
	public MemberBean findById(String id); 
	public CustomerBean login(CustomerBean param); 
	public int countCustomers(); 
	public int countEmployees(); 
	public boolean existId(String id);
	public void updatePass(MemberBean param);
	public void deleteMember(MemberBean param);

}
