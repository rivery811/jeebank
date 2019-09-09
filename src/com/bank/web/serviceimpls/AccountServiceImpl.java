package com.bank.web.serviceimpls;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.bank.web.domains.AccountBean;
import com.bank.web.services.AccountService;

public class AccountServiceImpl implements AccountService {
	private List<AccountBean> accounts;
	
	public AccountServiceImpl() {
		accounts = new ArrayList<>();
	}

	@Override
	public void createAccount(int money) {
		AccountBean account = new AccountBean();
		account.setMoney(String.valueOf(money));
		account.setRegDate(findDate());
		account.setAccountNum(createAccountNum());
		accounts.add(account);
		System.out.println(accounts.toString());
		
	}

	@Override
	public String createAccountNum() {
		String result = "";
		Random ran = new Random();
		for(int i = 0;i<9; i++){
			result += (i==4)?"-":String.valueOf(ran.nextInt(10));
			
		}
		return result;
	}

	@Override
	public List<AccountBean> findAll() {
		return accounts;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
			for(AccountBean a :accounts) {
				if(accountNum.equals(a.getAccountNum())) {
					account = a;
					break;
				}
		}
		
		return account;
	}

	@Override
	public int countAccounts() {
		
		return accounts.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		
		AccountBean account = findByAccountNum(accountNum);
		return accounts.contains(account);
	}

	@Override
	public String findDate() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date());
	}

	@Override
	public void depositMoney(AccountBean param) {
		String oldbalance = param.getMoney().split(",")[0];
		String deposit = param.getMoney().split(",")[1];
		if(existAccountNum(param.getAccountNum())) {
		param.setMoney(String.valueOf(Integer.parseInt(oldbalance)+Integer.parseInt(deposit)));
		}
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		String oldbalance = param.getMoney().split(",")[0];
		String deposit = param.getMoney().split(",")[1];
		int blalnce = Integer.parseInt(oldbalance)-Integer.parseInt(deposit);
		if(existAccountNum(param.getAccountNum())) {
			if(blalnce>0) {
				param.setMoney(String.valueOf(blalnce));
			}	
		}	
	}

	@Override
	public boolean deleteAccountNum(String accountNum) {
		boolean flag = false;
		if(existAccountNum(accountNum)) {
			for(AccountBean a :accounts) {
				if(accountNum.equals(a.getAccountNum())) {
					flag =  accounts.remove(a);
					
				}
			}
			
		}return flag;
		
	}

}
