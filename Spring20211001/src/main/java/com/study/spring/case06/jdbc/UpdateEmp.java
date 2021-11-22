package com.study.spring.case06.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateEmp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		/*
		int id = 1;
		String sql = "UPDATE emp SET ename=?, age=? WHERE eid=?";
		int rowcount = jdbcTemplate.update(sql,"john2",27,id);  //"john2",27,id 就是 sql 「?」 的順序
		System.out.println("Update rowcount: "+row);
		*/
		int id = 29;
		String sql = "DELETE FROM emp WHERE eid=?";
		int rowcount = jdbcTemplate.update(sql,id);
		System.out.println("Delete rowcount: "+rowcount);
		
		
	}

}
