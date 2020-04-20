package com.cyb.dubbo.api.service.query;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 学生编号列表查询条件
 * 
 * @author Administrator
 *
 */
public class StudentIdsQuery implements Serializable {

	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 分隔符
	 */
	public static final String DELIMITER = ",";

	/**
	 * 学生编号列表
	 */
	private Collection<Integer> studentIds;

	public StudentIdsQuery() {
		this.studentIds = Collections.emptyList();
	}

	public StudentIdsQuery(Collection<Integer> studentIds) {
		this.studentIds = studentIds;
	}

	public StudentIdsQuery(String str) {
		Pattern pattern = Pattern.compile(DELIMITER);
		studentIds = pattern.splitAsStream(str).map(Integer::valueOf).collect(Collectors.toList());
	}

	public Collection<Integer> getStudentIds() {
		return studentIds;
	}

	@Override
	public String toString() {
		return studentIds.stream().map(String::valueOf).collect(Collectors.joining(DELIMITER));
	}
}
