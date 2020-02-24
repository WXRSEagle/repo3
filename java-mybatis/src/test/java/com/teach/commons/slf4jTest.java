package com.teach.commons;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teach.entity.RoleInfo;

public class slf4jTest extends TestSupport{

	public static Logger log=LoggerFactory.getLogger(slf4jTest.class);
	@Test
	public void tests(){
		RoleInfo s=new RoleInfo();
		
		log.info("ssss");
		try {
			int i=1/0;
		} catch (Exception e) {
			log.warn("数学计算异常",e);
		}
	}
}
