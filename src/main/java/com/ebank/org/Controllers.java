package com.ebank.org;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {
	
	void sendDataToDB(String f_name, String l_name, String login, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/ebank?serverTimezone=UTC&useSSL=false", "root", "root"
					);
			conn.createStatement().executeUpdate(
					"INSERT INTO clients_site_log_info (FirstName, LastName, Login, Password) values"
					+ " ('" + f_name + "','" + l_name + "','" + login + "','" + pass + "');"
					);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/sign-in")
	public String goToSignInPage() {
		return "/WEB-INF/view/sign-in-page.jsp";
	}
	
	@RequestMapping("/new_account_info_page")
	public String goToNewAccInfoPage(HttpServletRequest request, Model model) {
		
		model.addAttribute("name", request.getParameter("first_name") + " " + request.getParameter("last_name"));
		model.addAttribute("login", request.getParameter("login"));
		model.addAttribute("password", request.getParameter("pass"));
		
		sendDataToDB(request.getParameter("first_name"),
				request.getParameter("last_name"), request.getParameter("login"), request.getParameter("pass")
				);
		
		return "/WEB-INF/view/new_account_info_page.jsp";
	}
	
}
