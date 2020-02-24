package com.teach.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

public abstract class TestSupport {
protected Logger log=LoggerFactory.getLogger(this.getClass());
protected String toJSONString(Object object){
	return JSON.toJSONString(object);
}
}
