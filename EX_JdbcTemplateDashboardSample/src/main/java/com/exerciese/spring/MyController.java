package com.exerciese.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@Autowired
	IsimpleBbsDAO dao;
	
	@RequestMapping("/")
	public String root() throws Exception {
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String userlistPage(Model model) {
		
		model.addAttribute("list", dao.listDao());
		return "list";
	}
	
	@RequestMapping("/view")
	public String test2(HttpServletRequest request, Model model) {
		
		String sId = request.getParameter("id");
		model.addAttribute("dto", dao.viewDao(sId));
		
		return "view";
	}

	@RequestMapping("/writeForm")
	public String writeForm() {
		
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write(Model model, HttpServletRequest request) {
		
		dao.writeDao(request.getParameter("writer"),
				request.getParameter("title"),
				request.getParameter("content"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(Model model, HttpServletRequest request) {
		
		dao.deleteDao(request.getParameter("id"));
		return "redirect:list";
	}
}
