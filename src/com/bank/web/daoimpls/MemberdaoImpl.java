package com.bank.web.daoimpls;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import com.bank.web.daos.Memberdao;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.pool.Constants;

public class MemberdaoImpl implements Memberdao{
	


	@Override
	public void insertCustomer(CustomerBean param) {
		System.out.println("진입");
		try {
			File file = new File(Constants.FILEPATH+"customer0905.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(String.format("%s,%s,%s,%s,%s"
					,param.getId(),param.getPw(),param.getName(),param.getSsn(),param.getCredit()));
			writer.newLine();
			writer.flush();
			writer.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("디오 인서트 아웃"+param.toString());
	}

	@Override
	public void insertEmployee(EmployeeBean param) {
		try {}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public CustomerBean login(CustomerBean param) {
		CustomerBean customer = new CustomerBean();
		System.out.println("디오로그인 진입"+param.toString());
		try {
			File file = new File(Constants.FILEPATH+"customer0905.txt");
		    BufferedReader reader = new BufferedReader(new FileReader(file));
		    String info = reader.readLine();
		    reader.close();
		    String [] infos = info.split(",");
		  
		    customer.setId(infos[0]);
		    customer.setPw(infos[1]);
		    customer.setName(infos[2]);
		    customer.setSsn(infos[3]);
		    customer.setCredit(infos[4]);
		    System.out.println("디오로그인 아웃"+customer.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return customer;

	}

}
