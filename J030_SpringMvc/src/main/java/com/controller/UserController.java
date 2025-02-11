package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("/")
	public String index(Model model) {

		User u = new User();
		model.addAttribute("user", u);

		List<User> allUser = service.allUser();
		model.addAttribute("Users", allUser);

		return "index";

	}

	@PostMapping("/adduser")
	public String formHandl(@ModelAttribute("user") User user) {
		service.addUser(user);

		return "redirect:/";

	}

	@GetMapping("/delete")
	public String deleteUser(@RequestParam("uid") int id) {
		service.delete(id);

		return "redirect:/";

	}

	@GetMapping("/edit")
	public String editUser(@RequestParam("uid") int id) {
		service.userById(id);

		return "redirect:/";

	}
}
