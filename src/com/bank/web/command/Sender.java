package com.bank.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.pool.Constants;

public class Sender {
	public static void forword(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("캐리어내부"+Receiver.cmd.getView());
		try {
			request.getRequestDispatcher(Receiver.cmd.getView())
			.forward(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
