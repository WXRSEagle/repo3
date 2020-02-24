package com.teach.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.teach.entity.RoleInfo;

public interface RoleInfoMapper {
	int insert(RoleInfo info);
	int delect(String id);
	int update(RoleInfo info);
//	@Select("select * from role_info")
	List<RoleInfo> selectAll();
	List<RoleInfo>select(int index,int len);

}
