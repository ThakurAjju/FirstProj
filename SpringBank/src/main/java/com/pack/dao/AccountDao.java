package com.pack.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.pack.model.Account;

@Component
public class AccountDao {
	
	@Autowired 
	private DataSource dataSource;
	
	public int insert(Account a)
	{
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		int i=insert.update("insert into account(accountnumber,accountname,currency,branch,availablebalance,openingbalance,closingbalance,creditdetails,debitdetails,corporateid) values(?,?,?,?,?,?,?,?,?,?)",a.getAccountnumber(),a.getAccountname(),a.getCurrency(),a.getBranch(),a.getAvailablebalance(),a.getOpeningbalance(),a.getClosingbalance(),a.getCreditdetails(),a.getDebitdetails(),a.getCorporateid());
		return i;
	}
	
	public List<Account> viewAll()
	{
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		String sql="select * from account";
		List<Account> accounts=insert.query(sql,new BeanPropertyRowMapper<Account>(Account.class));
		return accounts;
	}
	public Account getAccByNumber(int accountnumber){    
		JdbcTemplate obj = new JdbcTemplate(dataSource);
	    String sql="select * from account where accountnumber=?";    
	    Account acc= obj.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class),new Object[]{accountnumber});  
	    return acc;
	  
	    
	} 

	public int  modify(Account a) {
		   	 	
		JdbcTemplate insert = new JdbcTemplate(dataSource);
	int i=	insert.update("update account set accountname='"+a.getAccountname()+"',currency='"+a.getCurrency()+" ',branch=' "+a.getBranch()+" ',availablebalance=' "+a.getAvailablebalance()+" ',openingbalance=' "+a.getOpeningbalance()+" ',closingbalance=' "+a.getClosingbalance()+" ',creditdetails=' "+a.getCreditdetails()+" ',debitdetails=' "+a.getDebitdetails()+" ',corporateid=' "+a.getCorporateid()+" ' where accountnumber="+a.getAccountnumber());
	    return i;	
			} 
	public int delete(int accountnumber) {
	   	 	
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		int i=insert.update("delete from account where accountnumber="+accountnumber);
		return i;
		 
	} 

	
	
	
	
	

}
