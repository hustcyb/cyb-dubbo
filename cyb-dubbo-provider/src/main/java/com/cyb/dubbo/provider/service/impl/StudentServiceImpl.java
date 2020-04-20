package com.cyb.dubbo.provider.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

import com.cyb.dubbo.api.service.StudentService;
import com.cyb.dubbo.api.service.dto.StudentDTO;
import com.cyb.dubbo.api.service.query.StudentQuery;

@Service(protocol = "dubbo")
public class StudentServiceImpl implements StudentService {

	private static Map<Integer, StudentDTO> students = new HashMap<>();

	@Override
	public List<StudentDTO> listByQuery(StudentQuery query) {
		return students.values().stream().filter(student -> match(student, query))
				.collect(Collectors.toList());
	}

	@Override
	public List<StudentDTO> listByIds(Collection<Integer> ids) {
		return ids.stream().map(students::get).filter(Objects::nonNull)
				.collect(Collectors.toList());
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
	
	private static boolean match(StudentDTO student, StudentQuery query) {
		if (!StringUtils.isEmpty(query.getName()) && !Objects.equals(student.getName(), query.getName())) {
			return false;
		}
		
		if (query.getMinAge() != null && student.getAge() < query.getMinAge()) {
			return false;
		}
		
		if (query.getMaxAge() != null && student.getAge() > query.getMaxAge()) {
			return false;
		}
		
		return true;
	}

}
