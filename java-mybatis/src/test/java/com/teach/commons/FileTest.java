package com.teach.commons;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.teach.entity.File;
import com.teach.entity.RoleInfo;
import com.teach.mapper.FileMapper;
import com.teach.mapper.RoleInfoMapper;

import lombok.Data;

public class FileTest extends TestSupport{

	private SqlSession session;
	private FileMapper mapper;
	
	@Before
	public void befoer(){
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(this.getClass().getResourceAsStream("/mybatis-config.xml"));
		session = ssf.openSession();
		mapper = session.getMapper(FileMapper.class);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm");
	}
	@After
	public void after(){
		session.close();
	}
	
	
	@Test
	public void insert(){
		File file =new File();
		file.setFileId(1);
		file.setFileContentType("图片");
		file.setFileCreateTime(new Date());
		file.setFileName("鬼刀");
		file.setFileStatus(11);
		file.setFileUri("D:/update/eclips/guidao.jpg");
		mapper.insert(file);
		session.commit();
	}
	
	@Test
	public void delect(){
		File file =new File();
		file.setFileId(1);
		mapper.delect(file);
		session.commit();
	}
	
	@Test
	public void update(){
		File file =new File();
		file.setFileId(1);
		file.setFileContentType("图片");
		file.setFileCreateTime(new Date());
		file.setFileName("鬼刀");
		file.setFileStatus(12);
		file.setFileUri("D:/update/eclips/guidao.jpg");
		mapper.update(file);
		session.commit();
	}
	
	@Test
	public void selectAll(){
		List<File> list = mapper.selectAll();
    	log.info("{}",list);
	}
	
	@Test
	public void select(){
		List<File> list = mapper.select(0,2);
		log.info("{}",list);
	}
	
	@Test
	public void countAll(){
		log.info("{}",mapper.countAll());
	}
}
