package com.bank.web.serviceimpls;

import java.util.ArrayList;
import java.util.List;

import com.bank.web.daoimpls.MemberdaoImpl;
import com.bank.web.daos.Memberdao;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.domains.MemberBean;
import com.bank.web.services.MemberService;

public class MemberServiceImpl implements MemberService{
private Memberdao dao;
private CustomerBean customer;
private int count;

public MemberServiceImpl() {
	dao = new MemberdaoImpl();
	count++;
	customer = new CustomerBean();
}
	
	
	@Override
	public void join(CustomerBean param) {
		
		dao.insertCustomer(param);
			
	}

	@Override
	public void register(EmployeeBean param) {
		
		
	}

	@Override
	public List<CustomerBean> findAllCustomers() {
	
		
		return null;
	}

	@Override
	public List<EmployeeBean> findAllEmployees() {
	
		return null;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		/*List<MemberBean> members = new ArrayList<>();
		int count =0;
		
		for(CustomerBean c : customers) {
			if(name.equals(c.getName())) {
				count ++;
			}
		}
		
		for(EmployeeBean e : employees) {
			if(name.equals(e.getName())) {
				count ++;
			}
		}
		int j =0;
		for(CustomerBean c : customers) {
			if(name.equals(c.getName())) {
				members.add(c);
				j++;
				if(j==count) {
					return members;
				}
			}
		}
		
		for(EmployeeBean e : employees) {
			if(name.equals(e.getName())) {
				members.add(e);
				j++;
				if(j==count) {
					break;
			}
		}
	  }return members;	*/
		return null;
	}
	
	@Override
	public MemberBean findById(String id) {
		/*
		MemberBean m = new MemberBean();
		for(CustomerBean c :customers) {
			if(id.equals(c.getId())) {
				m=c;
				return m;
			}
		}
		for(EmployeeBean e :employees) {
			if(id.equals(e.getId())) {
				m=e;
				break;
			}
		}
		return m;*/
		return null;
	}

	@Override
	public CustomerBean login(CustomerBean param) {
		
		 customer = dao.login(param);
System.out.println("서비스 로그인"+customer.toString());
		return customer;
	
		
	}

	@Override
	public int countCustomers() {
		
		return 0;//customers.size();
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return 0;// employees.size();
	}

	@Override
	public boolean existId(String id) {
		boolean flag = false;
		MemberBean m = findById(id);
   
        return flag;//employees.contains(m)||customers.contains(m);
	}

	@Override
	public void updatePass(MemberBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		// TODO Auto-generated method stub
		
	}

}
