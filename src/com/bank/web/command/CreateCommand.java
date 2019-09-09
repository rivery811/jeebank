package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;

import com.bank.web.domains.CustomerBean;
import com.bank.web.serviceimpls.MemberServiceImpl;
import com.bank.web.services.MemberService;

public class CreateCommand extends MoveCommand {
	public CreateCommand(HttpServletRequest request) throws Exception {
		super(request);
	}
	public void execute() {
		super.execute();
		CustomerBean param = new CustomerBean();
		MemberService service = new MemberServiceImpl();

		String credit = request.getParameter("credit");	
		param.setCredit(credit);
		param.setId(request.getParameter("id"));
		param.setName(request.getParameter("name"));
		param.setPw(request.getParameter("pw"));
		param.setSsn(request.getParameter("ssn"));
		System.out.println("회원정보 :"+param.toString());
		System.out.println(String.format("%s%s%s%s%s"
				, param.getId(),param.getPw(),param.getName(),param.getSsn(),param.getCredit()));
		service.join(param);
		Receiver.cmd.setPage("login");
		System.out.println("회원가입후 갈 페이지 "+Receiver.cmd.getView());
		
	}

}
