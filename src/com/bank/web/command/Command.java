package com.bank.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.pool.Constants;

import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action,domain, page, view;
	@Override
	public void execute() {
		setDomain();
		setPage();
		System.out.println("리퀘스트 가야할 길 "+String.format(Constants.VIEWPATH, domain,page));
		this.view = String.format(Constants.VIEWPATH, domain,page);
		/* request.getRequestDispatcher
		 (String.format(Constants.VIEWPATH,"customer"
				 , request.getParameter("dest")))
		 .forward(request);*/
		
	}
	public void setDomain() {
		String path= request.getServletPath();
		System.out.println("서블릿 패스가 뭘까"+path);
		domain = path.replace(".do", "");
		domain = domain.substring(1);
	
	
	}
	public void setPage() {
		page = request.getParameter("page");
	}

	

}
