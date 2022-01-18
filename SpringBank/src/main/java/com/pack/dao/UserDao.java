package com.pack.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.pack.model.User;

@Component
public class UserDao {
	
	@Autowired 
	private DataSource dataSource;
	
	public int insert(User u)
	{
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		int i=insert.update("insert into user(userid,username,department,address,phonenumber,corporateid) values(?,?,?,?,?,?)",u.getUserid(),u.getUsername(),u.getDepartmment(),u.getAddress(),u.getPhonenumber(),u.getCorporateid());
		return i;
	}
	
	public List<User> viewAll()
	{
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		String sql="select * from user";
		List<User> users=insert.query(sql,new BeanPropertyRowMapper<User>(User.class));
		return users;
	}
	public User getUsrById(int userid){    
		JdbcTemplate obj = new JdbcTemplate(dataSource);
	    String sql="select * from user where userid=?";    
	    User usr= obj.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),new Object[]{userid});  
	    return usr;
	  
	    
	} 

	public int  modify(User u) {
		   	 	
		JdbcTemplate insert = new JdbcTemplate(dataSource);
	int i=	insert.update("update user set username='"+u.getUsername()+"',department='"+u.getDepartment()+" ',address=' "+u.getAddress()+" ',phonenumber=' "+u.getPhonenumber()+" ' where userid="+u.getUserid());
	    return i;	
			} 
	public int delete(int userid) {
	   	 	
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		int i=insert.update("delete from user where userid="+userid);
		return i;
		 
	} 

}
