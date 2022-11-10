package com.exerciese.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SimpleBbsDAO implements IsimpleBbsDAO {
	
	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<SimpleBbsDTO> listDao() {
	
		System.out.println("listDao()");
		
		String query = "select * from simple_bbs order by id desc";
		List<SimpleBbsDTO> dtos = jdbcTemplate.query(query, new BeanPropertyRowMapper<SimpleBbsDTO>(SimpleBbsDTO.class));
		
		return dtos;		
	
	}
	
	@Override
	public SimpleBbsDTO viewDao(String id) {

		System.out.println("viewDao()");
		
		String query = "select * from simple_bbs where id =" + id;
		SimpleBbsDTO dto = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<SimpleBbsDTO>(SimpleBbsDTO.class));
		
		return dto;		
		
	}
	
	public int writeDao(final String writer, final String title, final String content) {
		
		System.out.println("writeDao()");
		
		String query = "insert into simple_bbs (id, writer, title, content) " + 
		" values (nextval('simple_bbs_seq'), ?, ?, ?)";
		
		return jdbcTemplate.update(query, writer, title, content);		
	
	}
	
	public int deleteDao(final String id) {
		
		System.out.println("writeDao()");
		
		String query = "delete from simple_bbs where id = ?"; 
		
		return jdbcTemplate.update(query, Integer.parseInt(id));	
		
	}

}
