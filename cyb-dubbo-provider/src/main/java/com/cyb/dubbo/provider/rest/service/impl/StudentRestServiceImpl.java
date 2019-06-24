package com.cyb.dubbo.provider.rest.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.cyb.dubbo.api.rest.service.StudentRestService;
import com.cyb.dubbo.api.service.StudentService;
import com.cyb.dubbo.api.service.dto.StudentDTO;
import com.cyb.dubbo.api.service.query.StudentQuery;

@Service(protocol = "rest", document = "students")
public class StudentRestServiceImpl implements StudentRestService {
	
	@Autowired
	private StudentService studentService;

	@Override
	public List<StudentDTO> listByQuery(StudentQuery query) {
		return studentService.listByQuery(query);
	}

	@Override
	public StudentDTO getById(Integer id) {
		return studentService.getById(id);
	}

	@Override
	public Integer save(StudentDTO student) {
		return studentService.save(student);
	}

	@Override
	public void update(StudentDTO student) {
		studentService.update(student);
	}

}
