package com.cyb.dubbo.provider.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

import com.cyb.dubbo.api.service.StudentService;
import com.cyb.dubbo.api.service.dto.StudentDTO;
import com.cyb.dubbo.api.service.query.StudentQuery;

@Service(protocol = "dubbo")
public class StudentServiceImpl implements StudentService {
	
	private static Map<Integer, StudentDTO> students = new HashMap<>();

	@Override
	public List<StudentDTO> listbyQuery(StudentQuery query) {
		List<StudentDTO> matchedStudents = new ArrayList<>();
		
		for (StudentDTO student: students.values()) {
			String studentName = student.getName();
			String queryName = query.getName();
			if (queryName != null && !Objects.equals(queryName, studentName)) {
				continue;
			}
			
			Byte age = student.getAge();
			Byte minAge = query.getMinAge();
			Byte maxAge = query.getMaxAge();
			if (minAge != null && (age == null || age < minAge)) {
				continue;
			}
			
			if (maxAge != null && (age == null || age > maxAge)) {
				continue;
			}
			
			matchedStudents.add(student);
		}
		
		return matchedStudents;
	}

	@Override
	public StudentDTO getById(Integer id) {
		return students.get(id);
	}

	@Override
	public Integer save(StudentDTO student) {
		Integer id = student.getId();
		students.put(id, student);
		
		return id;
	}

	@Override
	public void update(StudentDTO student) {
		Integer id = student.getId();
		StudentDTO updatingStudent = students.get(id);
		if (updatingStudent != null) {
			BeanUtils.copyProperties(student, updatingStudent);
		}
	}

}
