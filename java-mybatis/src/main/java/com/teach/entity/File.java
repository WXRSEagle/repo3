package com.teach.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {
	private long fileId;
	private String fileContentType;
	private Date fileCreateTime;
	private String fileName;
	private String fileUri;
	private Integer fileStatus;
}
