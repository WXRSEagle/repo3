package com.teach.commons;

import java.sql.SQLException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBUtilTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Test
	public void testConn() throws Exception{
		System.out.println(DBUtil.getConnection());

	}
}
