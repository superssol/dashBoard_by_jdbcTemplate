package com.exerciese.spring;

import java.util.List;

public interface IsimpleBbsDAO {

	public List<SimpleBbsDTO> listDao();
	public SimpleBbsDTO viewDao(String id);
	public int writeDao(String writer, String title, String content);
	public int deleteDao(String id);
	
}
