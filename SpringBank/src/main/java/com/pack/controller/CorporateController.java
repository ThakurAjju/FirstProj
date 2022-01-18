package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.dao.CorporateDao;
import com.pack.model.Corporate;


@Controller
public class CorporateController {
	@Autowired
	CorporateDao corporateDao;
	@RequestMapping("/addCorporateForm")
	 public String add(Model m)  
	 {  
	     m.addAttribute("cor", new  Corporate());  
	     return "userForm1";  
	 }
	
	 @RequestMapping(value = "/addCorporate", method = RequestMethod.POST) 
	  public String addStudent(Corporate corporate) {
		 int res= corporateDao.insert(corporate);
		 if (res>=1)
		  return "redirect:/viewForm1";
		 else
			 return "addcorporate-error";
	   
	  }
	 @RequestMapping("/viewForm1")    
	    public String viewusr(Model m){    
	        List<Corporate> list=corporateDao.viewAll();  
	        m.addAttribute("list",list);  
	        return "view1";    
	    }  
	 @RequestMapping("/editCor")  
	    public String edit( @RequestParam("corporateid") String corporateid, Model m){    
			 
		Corporate cor=corporateDao.getCorById(corporateid);
		m.addAttribute("editCorForm",cor);
			 
			System.out.println("corporateid "+corporateid);
			 
	        return "editAction1";    
	    } 
	 @RequestMapping("/editCorporate")
		public String modify(Corporate corporate)
		{
			int res=corporateDao.modify(corporate);
			if (res>=1)
				  return "redirect:/viewForm1";
				 else
					 return "addcorporate-error";
			  			 
		}
	 @RequestMapping(value="/deleteCor/{phonenumber}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int phonenumber){    
		int res=corporateDao.delete(phonenumber); 
			if (res>=1)
				  return "redirect:/viewForm1";
				 else
					 return "addcorporate-error";
	         
	    }     
	
		
		
	

	

}
