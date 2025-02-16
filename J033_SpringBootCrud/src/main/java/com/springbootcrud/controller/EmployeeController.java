package com.springbootcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootcrud.entity.Employee;
import com.springbootcrud.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("employee", new Employee());
		model.addAttribute("employees", service.allEmployee());
		return "index";

	}

	@PostMapping("/addemployee")
	public String addEmployee(@ModelAttribute("employee") Employee emp) {
		service.addorUpdateEmployee(emp);
		return "redirect:/";

	}

	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("eid") int id) {
		service.deleteById(id);
		return "redirect:/";

	}

	@GetMapping("/edit")
	public String editEmployee(@RequestParam("eid") int id, Model model) {

		model.addAttribute("employee", service.editById(id));
		model.addAttribute("employees", service.allEmployee());
		return "index";

	}
}
