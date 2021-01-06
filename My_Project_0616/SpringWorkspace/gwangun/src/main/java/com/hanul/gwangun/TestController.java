package com.hanul.gwangun;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/joinRequestParam")
	public String join(@RequestParam String name
			, @RequestParam String gender
			, String email, int age, Model model
			) {
		model.addAttribute("name", name);
		model.addAttribute("gender", gender);
		model.addAttribute("email", email);
		model.addAttribute("age", age);
		model.addAttribute("method", "@RequestParam");
		return "member/myInfo";
	}
	@RequestMapping("/joinRequest")
	public String join(HttpServletRequest request
						, Model model) {
		//model.addAttribute("속성명", 데이터);
		model.addAttribute("name", request.getParameter("name"));
		model.addAttribute("gender", request.getParameter("gender"));
		model.addAttribute("email", request.getParameter("email"));
		//String -> int
		//Wrapper : Integer.valueOf : Integer -> int: auto Unboxing
		//			Integer.parseInt : int 
		int age = request.getParameter("age")==null ? 0 :
			Integer.parseInt(request.getParameter("age"));
		model.addAttribute("age", age==0? "" : age);
		model.addAttribute("method", "HttpServletRequest");
		return "member/myInfo";
	}
	
	
	@RequestMapping("/member")
	public String member() {
		return "member/join";
	}
	
	
	
	@RequestMapping("/second")
	public ModelAndView second() {
		ModelAndView model = new ModelAndView();
		SimpleDateFormat df 
			= new SimpleDateFormat("a hh시 mm분 ss초");
		String now= df.format(new Date() );
		model.addObject("now", now);
		model.setViewName("view");
		return model;
	}
	
	
	
	@RequestMapping("/first")
	public String aaaaaa(Model model) {
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy년 MM일 dd일");
		String today = sdf.format(new Date());

		model.addAttribute("today", today);
//		model.addAttribute("today", "홍길동");
		return "view";
	}
}
