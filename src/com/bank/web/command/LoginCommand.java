package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;

import com.bank.web.domains.CustomerBean;
import com.bank.web.serviceimpls.MemberServiceImpl;
import com.bank.web.services.MemberService;

public class LoginCommand extends MoveCommand {
	public LoginCommand(HttpServletRequest request) throws Exception {
		super(request);
	}
public void execute() {
	super.execute();
	 CustomerBean param = new CustomerBean();
	 MemberService service = new MemberServiceImpl();
	 String id = request.getParameter("id");
	 String pw = request.getParameter("pw");
	 id = request.getParameter("id");
	 pw = request.getParameter("pw");
	 param.setId(id);
	 param.setPw(pw);
	 
	 System.out.println(String.format(" 로그인 1"+param.toString()));
	 CustomerBean customer = service.login(param);
	 System.out.println(" 아이디 비교"+param.getId());
	 System.out.println("커스터머아이디"+customer.getId());
	 String page= "";
	 
	 if(customer==null) {
		page = "login";
	 }else {
		 page = "mypage";
		
	 }
	request.setAttribute("customer", customer);
	Receiver.cmd.setPage("page");
	System.out.println("로그인후 갈 페이지"+Receiver.cmd.getView());
}
	
}
