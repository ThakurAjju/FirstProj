package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.dao.UserDao;
import com.pack.model.User;


@Controller
public class UserController {
	@Autowired
	UserDao userDao;
	@RequestMapping("/addUserForm")
	 public String add(Model m)  
	 {  
	     m.addAttribute("usr", new  User());  
	     return "userForm";  
	 }
	
	 @RequestMapping(value = "/addUser", method = RequestMethod.POST) 
	  public String addStudent(User users) {
		 int res= userDao.insert(users);
		 if (res>=1)
		  return "redirect:/viewForm";
		 else
			 return "adduser-error";
	   
	  }
	 @RequestMapping("/viewForm")    
	    public String viewusr(Model m){    
	        List<User> list=userDao.viewAll();  
	        m.addAttribute("list",list);  
	        return "view";    
	    }  
	 @RequestMapping("/editUsr")  
	    public String edit( @RequestParam("userid") int userid, Model m){    
			 
		User usr=userDao.getUsrById(userid);
		m.addAttribute("editUsrForm",usr);
			 
			System.out.println("userid "+userid);
			 
	        return "editAction";    
	    } 
	 @RequestMapping("/editUser")
		public String modify(User users)
		{
			int res=userDao.modify(users);
			if (res>=1)
				  return "redirect:/viewForm";
				 else
					 return "adduser-error";
			  			 
		}
	 @RequestMapping(value="/deleteUsr/{userid}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int userid){    
		int res=userDao.delete(userid); 
			if (res>=1)
				  return "redirect:/viewForm";
				 else
					 return "adduser-error";
	         
	    }     
	
		
		
	

	

}
