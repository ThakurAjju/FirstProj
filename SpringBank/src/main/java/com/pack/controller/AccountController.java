package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.dao.AccountDao;
import com.pack.model.Account;


@Controller
public class AccountController {
	@Autowired
	AccountDao accountDao;
	@RequestMapping("/addAccountForm")
	 public String add(Model m)  
	 {  
	     m.addAttribute("acc", new  Account());  
	     return "userForm2";  
	 }
	
	 @RequestMapping(value = "/addAccount", method = RequestMethod.POST) 
	  public String addStudent(Account account) {
		 int res= accountDao.insert(account);
		 if (res>=1)
		  return "redirect:/viewForm2";
		 else
			 return "addaccount-error";
	   
	  }
	 @RequestMapping("/viewForm2")    
	    public String viewAcc(Model m){    
	        List<Account> list=accountDao.viewAll();  
	        m.addAttribute("list",list);  
	        return "view2";    
	    }  
	 @RequestMapping("/editAcc")  
	    public String edit( @RequestParam("accountnumber") int accountnumber, Model m){    
			 
		Account acc=accountDao.getAccByNumber(accountnumber);
		m.addAttribute("editAccForm",acc);
			 
			System.out.println("accountnumber "+accountnumber);
			 
	        return "editAction2";    
	    } 
	 @RequestMapping("/editAccount")
		public String modify(Account account)
		{
			int res=accountDao.modify(account);
			if (res>=1)
				  return "redirect:/viewForm2";
				 else
					 return "addaccount-error";
			  			 
		}
	 @RequestMapping(value="/deleteAcc/{accountnumber}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int accountnumber){    
		int res=accountDao.delete(accountnumber); 
			if (res>=1)
				  return "redirect:/viewForm2";
				 else
					 return "addaccount-error";
	         
	    }     
	
		
		
	

	

}
