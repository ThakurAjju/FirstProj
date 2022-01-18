package com.pack.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pack.model.Corporate;

@Component


public class CorporateDao {
	@Autowired 
	private DataSource dataSource;
	
	public int insert(Corporate c)
	{
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		int i=insert.update("insert into corporate(corporateid,corporatename,address,phonenumber) values(?,?,?,?)",c.getCorporateid(),c.getCorporatename(),c.getAddress(),c.getPhonenumber());
		
		return i;
	}
	
	public List<Corporate> viewAll()
	{
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		String sql="select * from corporate";
		List<Corporate> corporate=insert.query(sql,new BeanPropertyRowMapper<Corporate>(Corporate.class));
		return corporate;
	}
	public Corporate getCorById(String corporateid){    
		JdbcTemplate obj = new JdbcTemplate(dataSource);
	    String sql="select * from corporate where corporateid=?";    
	    Corporate cor= obj.queryForObject(sql, new BeanPropertyRowMapper<Corporate>(Corporate.class),new Object[]{corporateid});  
	    return cor;
	  
	    
	} 

	public int  modify(Corporate c) {
		   	 	
		JdbcTemplate insert = new JdbcTemplate(dataSource);
	int i=	insert.update("update corporate set  corporatename='"+c.getCorporatename()+" ',address=' "+c.getAddress()+" ',phonenumber=' "+c.getPhonenumber()+" ' where phonenumber="+c.getPhonenumber());
	    return i;	
			} 
	public int delete(int phonenumber) {
	   	 	
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		int i=insert.update("delete from corporate where phonenumber="+phonenumber);
		return i;
		 
	} 


}
