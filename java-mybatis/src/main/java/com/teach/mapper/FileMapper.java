package com.teach.mapper;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.teach.entity.File;

public interface FileMapper {
	int insert(File info);
	int delect(File info);
	int update(File info);
	List<File> selectAll();
	List<File>select(@Param("index")int index,
			                @Param("len")int len);
	int countAll();
}