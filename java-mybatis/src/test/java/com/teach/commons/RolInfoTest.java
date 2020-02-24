package com.teach.commons;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.teach.entity.RoleInfo;
import com.teach.mapper.RoleInfoMapper;

public class RolInfoTest extends TestSupport{

	private SqlSession session;
	private RoleInfoMapper mapper;
	
	@Before
	public void befoer(){
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(this.getClass().getResourceAsStream("/mybatis-config.xml"));
		session = ssf.openSession();
		mapper = session.getMapper(RoleInfoMapper.class);
	}
	@After
	public void after(){
		session.close();
	}
	@Test
	public void insert(){
		RoleInfo roleInfo = new RoleInfo(-5, "第一个MyBatis");
		mapper.insert(roleInfo);
		session.commit();
	}
	
	
	
	@Test
	public void delect(){
		mapper.delect("-3");
		session.commit();
	}
	
	@Test
	public void update(){
		RoleInfo roleInfo = new RoleInfo(-1, "冻结用户");
		mapper.update(roleInfo);
		session.commit();
	}
	
	@Test
	public void selectAll(){
		List<RoleInfo> list = mapper.selectAll();
		log.info("{}",list);
	}
}

