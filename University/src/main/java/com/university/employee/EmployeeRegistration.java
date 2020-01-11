package com.university.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeRegistration {

	@RequestMapping("/home")
	public String getWelcomePage() {
		return "Welcome.html";
	}
}
