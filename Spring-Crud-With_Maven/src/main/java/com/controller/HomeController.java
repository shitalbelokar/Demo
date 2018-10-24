package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ServiceI.ServiceI;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.model.Login;
import com.model.User;

@Controller
public class HomeController {
@Autowired
ServiceI si;

@RequestMapping("/")
public String loginPage(){
	System.out.println("in loginpage");
	return "Login";
	
}
@RequestMapping("/registerpage")
public String registerPage(){
	System.out.println("in registerpage");
	return "Register";
}
@RequestMapping("/reg")
public String saveData(@ModelAttribute Login l,@ModelAttribute User u,Model model){
	System.out.println("in saveData");
	//l.setU(u);
	u.setL(l);
	User lg=si.saveData(l,u);
	if(lg!=null){
		model.addAttribute("msg", "data saved------!");
		return "Login";
	}
	else{
		model.addAttribute("msg", "data not saved-----!");
	return "Login";
	}
}
	@RequestMapping("/log")
	public String loginUser(@ModelAttribute Login l,Model model ,String un,String pw){
		System.out.println("in loginuser");
		Login lg=si.findAllByUnAndPw(un, pw);
		if(lg!=null){
		List<User> list=si.getAllRecord();
		System.out.println(list);
		model.addAttribute("ldata", list);
		return "Success";
		}
		else{
		model.addAttribute("msg", "wrong username or password");
		return "Login";
		}
	}
	@RequestMapping("/del")
	public String deleteUser(@RequestParam int uid,@ModelAttribute User u,Model model){
		System.out.println("in deleteuser");
		//u.getL().setLogid(logid);
		si.deleteUser(uid);
		List<User> list=si.getAllRecord();
		System.out.println(list);
		model.addAttribute("ldata", list);
		return "Success";
		
	}
	@RequestMapping("/edit")
	public String editUser(@RequestParam int uid,Model model){
		System.out.println("in edituser");
		User lg=si.editdata(uid);
		model.addAttribute("ldata",lg);
		return "Edit";
		
	}
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute Login l,@ModelAttribute User u,Model model){
		System.out.println("in updateuser");
		//l.setU(u);
		u.setL(l);
		User lg=si.updateUser(l, u);
		
		
		if(lg!=null){
		List<User> list=si.getAllRecord();
		model.addAttribute("ldata", list);
		return "Success";
		}
		else{
			model.addAttribute("msg", "record not updated ");
			return "Login";
		}
		
	}
}

